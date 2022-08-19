package com.dreyer.projectcars.web.controller;

import com.dreyer.projectcars.web.service.GetAllCarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class GetAllCarsController {
    private final GetAllCarsService getAllCarsService;

    @Autowired
    public GetAllCarsController(GetAllCarsService getAllCarsService) {
        this.getAllCarsService = getAllCarsService;
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllCars() {
        return ResponseEntity.ok(getAllCarsService.execute());
    }
}
