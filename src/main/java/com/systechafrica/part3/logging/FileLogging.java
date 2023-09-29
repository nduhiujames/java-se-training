package com.systechafrica.part3.logging;

import java.io.IOException;
import java.time.Instant;
import java.util.logging.*;

import com.systechafrica.controlflow.ControlFlow;

public class FileLogging {
    private static final Logger LOGGER= Logger.getLogger(FileLogging.class.getName());
    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler=new FileHandler("log.txt");
        CustomFormatter formatter=new CustomFormatter();
        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);
        LOGGER.info("Info message logging\n");
        LOGGER.severe("error message logging\n");
        LOGGER.warning("warning message logging\n");
    }
    public static void test(){
        LOGGER.info("Info message logging\n");
        LOGGER.severe("error message logging\n");
        LOGGER.warning("warning message logging\n");

    }
    static class CustomFormatter extends Formatter{

        @Override
        public String format(LogRecord record) {
            String method=record.getSourceMethodName();
            String level=record.getLevel().getName();
            String message=record.getMessage();
            System.out.println(record.getMessage());
            Instant instant =record.getInstant();
            return instant+ "|"+method+"|"+level+ "|"+message;
        }

    }
    
}
