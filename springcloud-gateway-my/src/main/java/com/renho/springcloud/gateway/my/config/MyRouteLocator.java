package com.renho.springcloud.gateway.my.config;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import reactor.core.publisher.Flux;

/**
 * @author renho
 * @date 2020/12/21
 */
public class MyRouteLocator implements RouteLocator {

    private RouteDefinitionLocator routeDefinitionLocator;

    public MyRouteLocator(RouteDefinitionLocator routeDefinitionLocator) {
        this.routeDefinitionLocator = routeDefinitionLocator;
    }

    @Override
    public Flux<Route> getRoutes() {
        System.out.println("--------------------->MyRouteLocator.getRoutes<---------------------");
//        Flux<Route> routes = this.routeDefinitionLocator.getRouteDefinitions().map(this::convertToRoute);
//        return routes;
        return Flux.empty();
    }

//    private Route convertToRoute(RouteDefinition routeDefinition) {
//        return Route.async(routeDefinition)
//                .asyncPredicate(predicate)
//                .replaceFilters(gatewayFilters).build();
//    }

}
