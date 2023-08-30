package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;

import com.systechafrica.loopingstatements.LoopingStatements;

public class StringBuilderClassDemo {
    private static final Logger LOGGER= Logger.getLogger(StringBuilderClassDemo.class.getName());
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(100);//capacity and not the number of chracters
        String str="";
        
        boolean equals= str.equals(sb.toString());
        LOGGER.info("" + equals);
        
    }
    
}
