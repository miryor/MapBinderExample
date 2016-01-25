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
public class S3Storage implements Storage {
    
    private final String cachePath;
    
    @Inject
    public S3Storage( @Named("cache_path") String cachePath ) {
        this.cachePath = cachePath;
    }

    @Override
    public StorageMessage getMessage(String id) throws IOException {
        // obviously not a real implementation
        System.out.println( "S3 getMessage: " + id + ", cachePath: " + cachePath );
        // terrible terrible, never do this obviously
        File nullFile = null;
        return new StorageMessage( id, nullFile );
    }

    @Override
    public StorageMessage putMessage(String id, File file) throws IOException {
        // obviously not a real implementation
        System.out.println( "S3 putMessage: " + id + ", cachePath: " + cachePath );
        return new StorageMessage( id, file );
    }
}
