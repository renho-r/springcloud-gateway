package com.renho.springcloud.gateway.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringCloudApplication
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudGatewayMyApplication {

    public static void main( String[] args ) {
//        HandlerMapping
//        RouteDefinitionLocator
        SpringApplication.run(SpringCloudGatewayMyApplication.class, args);
    }

}
