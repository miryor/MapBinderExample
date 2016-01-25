/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbinderexample.model;

/**
 * Typical model class to represent our Customer
 * 
 * @author royrim
 */
public class Customer {
    private final int id;
    private final String name;
    private final StorageType storageType;

    public Customer(int id, String name, StorageType storageType) {
        this.id = id;
        this.name = name;
        this.storageType = storageType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StorageType getStorageType() {
        return storageType;
    }
    
}
