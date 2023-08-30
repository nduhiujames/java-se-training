package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;



public class StringClassDemo {
     private static final Logger LOGGER= Logger.getLogger(StringClassDemo.class.getName());

     public static void main(String[] args) {

     String message="Hello ";
     //no effect
     message.concat("World!");
     //has effect by reasigning
     message=message.concat("Programmer!");
     LOGGER.info( message );

     String sb=new String("Hello, World!");
     String sa="Hello, World!";
     boolean equals=sa.equals(sb);
      boolean equals2 = sa == sb;
     LOGGER.info( ""+equals);
     LOGGER.info( ""+equals2);
     }
    
}
 