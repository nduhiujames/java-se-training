package com.systechafrica.part2.classes;

import java.util.logging.Logger;



public class Intern {
    private static final Logger LOGGER= Logger.getLogger(Intern.class.getName());
  String name;
  String phoneNumber;
  String email;
  
  public void attendClass(){
    LOGGER.info("Attend class ");

  }
  public void doAssignment(){
    LOGGER.info("Do Assignment ");

  }
    
}
