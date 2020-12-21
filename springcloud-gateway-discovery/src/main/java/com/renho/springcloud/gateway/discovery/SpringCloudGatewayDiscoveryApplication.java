package com.renho.springcloud.gateway.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteDefinitionRouteLocator;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;

//@SpringCloudApplication
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudGatewayDiscoveryApplication {

    public static void main( String[] args ) {
//        HandlerMapping
//        RouteDefinitionLocator
        SpringApplication.run(SpringCloudGatewayDiscoveryApplication.class, args);
    }

}
