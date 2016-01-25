/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbinderexample.model;

import java.io.File;
import java.util.Objects;

/**
 * Sample message model class
 * 
 * @author royrim
 */
public class StorageMessage {
    
    private final String id;
    private final File file;

    public StorageMessage(String id, File file) {
        this.id = id;
        this.file = file;
    }

    public String getId() {
        return id;
    }

    public File getFile() {
        return file;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StorageMessage other = (StorageMessage) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
