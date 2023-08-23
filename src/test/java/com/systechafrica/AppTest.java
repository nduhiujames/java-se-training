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
        int result=app.add(0, 0);
        //then
        int expected=5;
        //verify that results =expected
        Assertions.assertEquals(expected, result, "The sum of 2 + 3 should be 5");



    }

  }