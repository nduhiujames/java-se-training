package com.systechafrica.part3.jdbc;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.FileLogging;

public class DatabaseAccessDemo {
    private static final Logger LOGGER= Logger.getLogger(DatabaseAccessDemo.class.getName());
    public static void main(String[] args) {
        try {
            FileHandler fileHandler=new FileHandler("working-with-databases.txt");
        CustomFormatter formatter=new CustomFormatter();
        LOGGER.addHandler(fileHandler);
           //fileHandler.setFormatter(formatter);
     
     } catch (Exception e) {
        LOGGER.severe("unable to perform operation"+e.getMessage());
        
        }
    
}
}
