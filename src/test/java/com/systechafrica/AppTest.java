package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    //? Reference=>app
    App app=new App();

    @Test
    void add(){
        //when
        int result=app.add(25, 10);
        //then
        int expected=35;
        //verify that results =expected
        Assertions.assertEquals(expected, result, "The sum of 25 + 10 should be 35");



    }

  }