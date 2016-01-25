/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbingerexample.storage;

import com.miryor.mapbinderexample.model.Customer;
import com.miryor.mapbinderexample.model.StorageMessage;
import com.miryor.mapbinderexample.model.StorageType;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.inject.Inject;

/**
 *
 * @author royrim
 */
public class StorageUtil {
    
    private final Map<StorageType,Storage> storageMap;
    
    @Inject
    public StorageUtil( Map<StorageType,Storage> storageMap ) {
        this.storageMap = storageMap;
    }
    
    public StorageMessage putMessage( Customer c, String id, File file ) throws IOException {
        return storageMap.get( c.getStorageType() ).putMessage( id, file );
    }
    
    public StorageMessage getMessage( Customer c, String id ) throws IOException {
        return storageMap.get( c.getStorageType() ).getMessage( id );
    }
    
}
