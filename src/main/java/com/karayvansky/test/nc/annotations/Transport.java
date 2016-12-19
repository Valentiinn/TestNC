package com.karayvansky.test.nc.annotations;

import javax.persistence.*;

@Entity
@Table(name = "TRANSPORTS")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "Model")
    private String model;
    @Column(name = "Fuel")
    private String fuel;

    public Transport() {
    }

    public Transport(String model, String fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Transport: " + '\n' +
                "id: " + id + '\n' +
                "model: " + model + '\n' +
                "fuel: " + fuel + '\n';
    }
}