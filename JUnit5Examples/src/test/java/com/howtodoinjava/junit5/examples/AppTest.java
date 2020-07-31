package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
 
public class AppTest {
     
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll ejecutado");
    }
     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach ejecutado");
    }
     
    @Tag("DEV")
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST 1 ejecutado=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }
     
    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST 2 ejecutado=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }
     
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach ejecutado");
    }
     
    @AfterAll
    static void tear(){
        System.out.println("@AfterAll ejecutado");
    }
}
