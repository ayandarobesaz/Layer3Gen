package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/**
* Generated by Springboot-3layer-Generator at Feb 26, 2023, 4:26:01 PM
*/
@RestController
@RequestMapping("/order/")
public class OrderController implements CrudController<Order,java.lang.Integer>{

    @Autowired
    private OrderService service;

    @Override
    public ResponseEntity<Order> create(@RequestBody Order entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<Order> update(@RequestBody Order entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<Order>> find(
            @RequestBody Order entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.find(entity,pageable));
    }

    @Override
    public ResponseEntity<Order> getOne(@PathVariable("id") java.lang.Integer primaryKey) {
        return service.getOne(primaryKey).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}