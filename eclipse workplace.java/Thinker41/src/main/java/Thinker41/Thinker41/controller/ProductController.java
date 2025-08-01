package Thinker41.Thinker41.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Thinker41.Thinker41.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/configure")
    public ResponseEntity<?> configureProduct(@RequestBody Map<String, String> selectedChoices) {
        return ResponseEntity.ok(service.validateAndCalculate(selectedChoices));
    }
}

