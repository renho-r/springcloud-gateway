package com.renho.springcloud.gateway.my.config;

import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import reactor.core.publisher.Flux;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author renho
 * @date 2020/12/21
 */
public class MyRouteDefinitionLocator implements RouteDefinitionLocator {

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {

        System.out.println("--------------------->MyRouteDefinitionLocator.getRouteDefinitions<---------------------");

        List<RouteDefinition> routeDefinitions = new ArrayList();

        RouteDefinition routeDefinition = new RouteDefinition();
        routeDefinition.setId("renho");
        routeDefinition.setUri(URI.create("http://httpbin.org"));

        List<PredicateDefinition> predicates = new ArrayList();
        PredicateDefinition predicateDefinition = new PredicateDefinition();
        predicateDefinition.setName("Path");
        predicateDefinition.addArg("pattern", "/renho");
        predicates.add(predicateDefinition);

        routeDefinition.setPredicates(predicates);
        routeDefinitions.add(routeDefinition);
        return Flux.fromIterable(routeDefinitions);
    }
}
