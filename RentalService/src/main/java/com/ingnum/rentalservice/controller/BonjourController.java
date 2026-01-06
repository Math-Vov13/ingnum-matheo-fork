package com.ingnum.rentalservice.controller;

import com.ingnum.rentalservice.model.Car;
import com.ingnum.rentalservice.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BonjourController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BonjourController.class);

    @Value("${customer.service.url}")
    private String customerServiceUrl;

    private final CarRepository carRepository;

    public BonjourController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("/customer/{name}")
    public String bonjour(@PathVariable String name) {
        RestTemplate restTemplate = new RestTemplate();
        String url = customerServiceUrl + "/api/customers/" + name + "/address";
        LOGGER.info("Requesting URL: {}", url);
        return restTemplate.getForObject(url, String.class);
    }
}
