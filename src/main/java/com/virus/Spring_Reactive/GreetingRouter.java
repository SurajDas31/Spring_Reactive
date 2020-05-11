package com.virus.Spring_Reactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
//we use a router to handle the only route we expose ("/hello")
@Configuration
public class GreetingRouter {
    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler handler){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                handler::hello);
    }
}
