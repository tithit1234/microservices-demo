package com.example.order_service.controller;

import com.example.order_service.client.UserClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

   /* @GetMapping("/{id}")
    public ResponseEntity<String> getOrder(@PathVariable String id) {
        // Call User Service to fetch user info
        RestTemplate restTemplate = new RestTemplate();
        String user = restTemplate.getForObject("http://localhost:8081/users/" + id, String.class);

        return ResponseEntity.ok("Order for " + user);
    }*/


    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getOrder(@PathVariable String id) {
        String user = userClient.getUser(id);
        System.out.println("user-------> " + user);
        return ResponseEntity.ok("Order for " + user);
    }


}

