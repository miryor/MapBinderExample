/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbingerexample.storage;

import com.miryor.mapbinderexample.model.StorageMessage;
import java.io.File;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author royrim
 */
public class CIFSStorage implements Storage {
    
    private final String cifsPrefix;
    
    @Inject
    public CIFSStorage( @Named("cifs_prefix") String cifsPrefix ) {
        this.cifsPrefix = cifsPrefix;
    }

    @Override
    public StorageMessage getMessage(String id) throws IOException {
        // obviously not a real implementation
        System.out.println( "CIFS getMessage: " + id + ", cifsPrefix: " + cifsPrefix );
        // terrible terrible, never do this obviously
        File nullFile = null;
        return new StorageMessage( id, nullFile );
    }

    @Override
    public StorageMessage putMessage(String id, File file) throws IOException {
        // obviously not a real implementation
        System.out.println( "CIFS putMessage: " + id + ", cifsPrefix: " + cifsPrefix );
        return new StorageMessage( id, file );
    }
    
}
