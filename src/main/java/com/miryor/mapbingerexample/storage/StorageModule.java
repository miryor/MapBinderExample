/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbingerexample.storage;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;
import com.miryor.mapbinderexample.model.StorageType;

/**
 *
 * @author royrim
 */
public class StorageModule extends AbstractModule {
    
    private final String cifsPrefix;
    private final String cachePath;
    
    public StorageModule( String cifsPrefix, String cachePath ) {
        this.cifsPrefix = cifsPrefix;
        this.cachePath = cachePath;
    }
    
    @Override
    protected void configure() {
        
        // we tell guice to be on the lookout for any @Named annotations and 
        // to use the value of cifsPrefix to bind that parameter to
        bindConstant().annotatedWith(Names.named("cifs_prefix")).to(cifsPrefix);
        bindConstant().annotatedWith(Names.named("cache_path")).to(cachePath);
    
        MapBinder<StorageType,Storage> mapBinder = MapBinder.newMapBinder(binder(),  StorageType.class, Storage.class);
        mapBinder.addBinding(StorageType.CIFS).to( CIFSStorage.class );
        mapBinder.addBinding(StorageType.S3).to( S3Storage.class );
    }
}
