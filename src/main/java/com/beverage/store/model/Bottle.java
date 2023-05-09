package com.beverage.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bottle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private String bottlePic;

    private double volume;

    private boolean alcoholic;

    private double volumePercent;

    private int price;

    private String supplier;

    private int inStock;

    public Bottle() {
    }

    public Bottle(String name, String bottlePic, double volume, boolean alcoholic, double volumePercent, int price, String supplier, int inStock) {
        this.name = name;
        this.bottlePic = bottlePic;
        this.volume = volume;
        this.alcoholic = alcoholic;
        this.volumePercent = volumePercent;
        this.price = price;
        this.supplier = supplier;
        this.inStock = inStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBottlePic() {
        return bottlePic;
    }

    public void setBottlePic(String bottlePic) {
        this.bottlePic = bottlePic;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public double getVolumePercent() {
        return volumePercent;
    }

    public void setVolumePercent(double volumePercent) {
        this.volumePercent = volumePercent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
