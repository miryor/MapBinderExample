/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miryor.mapbinderexample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.miryor.mapbinderexample.model.Customer;
import com.miryor.mapbinderexample.model.StorageMessage;
import com.miryor.mapbinderexample.model.StorageType;
import com.miryor.mapbingerexample.storage.StorageModule;
import com.miryor.mapbingerexample.storage.StorageUtil;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author royrim
 */
public class App {
    
    public static void main( String[] args ) throws IOException {
        
        Injector injector = Guice.createInjector( 
                new StorageModule( "smb://domain;user:password@cifspath", "/my/cache/path" )
        );
        StorageUtil storageUtil = injector.getInstance( StorageUtil.class );
        
        Customer c1 = new Customer( 1, "CIFS Example", StorageType.CIFS );
        Customer c2 = new Customer( 2, "S3 Example", StorageType.S3 );
        
        // these File objects are null as we're not doing anything with them anyway
        File x = null;
        File y = null;
        // we just want to prove that when one customer is set to use one StorageType
        StorageMessage c1m = storageUtil.putMessage( c1, "x", x );
        // versus another the implementation called is different
        StorageMessage c2m = storageUtil.putMessage( c2, "y", y );
        
    }
    
}
