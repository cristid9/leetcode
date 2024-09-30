package com.example.ssch11ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static reactor.core.publisher.Mono.just;

@Configuration
public class RouterFunctionConfig {
    @Autowired
    private TacoRepository tacoRepo;

    @Bean
    public RouterFunction<?> routerFunction() {
        return route(GET("/design/taco"), this::recents).andRoute(POST("/design"), this::postTaco);
        public Mono<ServerResponse> recents (ServerRequest request){
            return ServerResponse.ok()
                    .body(tacoRepo.findAll().take(12), Taco.class);
        }
        public Mono<ServerResponse> postTaco (ServerRequest request){
            Mono<Taco> taco = request.bodyToMono(Taco.class);
            Mono<Taco> savedTaco = tacoRepo.save(taco);
            return ServerResponse
                    .created(URI.create(
                            "http://localhost:8080/design/taco/" +
                                    savedTaco.getId()))
                    .body(savedTaco, Taco.class);
        }
    }