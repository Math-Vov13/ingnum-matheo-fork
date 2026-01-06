package com.ingnum.rentalservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car", schema = "rental_service")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "license_plate", length = 10, nullable = false, unique = true)
    private String licensePlate;

    @Column(name = "model", length = 50, nullable = false)
    private String model;

    @Column(name = "daily_rate", nullable = false)
    private double dailyRate;

    public Car() {
    }

    public Car(String licensePlate, String model, double dailyRate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}