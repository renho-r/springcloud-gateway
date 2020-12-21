package com.renho.springcloud.gateway.my.config;

import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renho
 * @date 2020/12/21
 */
@Configuration
public class MyGatewayConfig {

    @Bean
    public RouteDefinitionLocator myRouteDefinitionLocator() {
        return new MyRouteDefinitionLocator();
    }

    @Bean
    public RouteLocator myRouteLocator() {
        return new MyRouteLocator(myRouteDefinitionLocator());
    }

}
