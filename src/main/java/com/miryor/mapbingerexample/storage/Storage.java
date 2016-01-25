/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbingerexample.storage;

import com.miryor.mapbinderexample.model.StorageMessage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author royrim
 */
public interface Storage {
    
    public StorageMessage getMessage( String id ) throws IOException;
    
    public StorageMessage putMessage( String id, File file ) throws IOException;
    
}
