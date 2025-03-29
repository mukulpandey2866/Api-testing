package org.example.test.services;

import org.junit.jupiter.api.*;

public class CalculatorService_testUnit5   {

    @BeforeAll
    public static void init(){
        System.out.println("Before all the test cases, Single time logic");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("After all the test cases, Single time logic");

    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each test case");

    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each test case");
    }

    @Test
    @DisplayName("add2no")
    public void addNewNumbers_Test(){
        System.out.println("First test: Add two numbers test");
        int result= CalculatorService.addTwoNumbers(12,12);
        int expected=24;
        Assertions.assertEquals(expected,result,"Not Mached");

    }

    @Test
    @Disabled
    public void addAllNumbers_Test(){
        System.out.println("Second test: Add all the numbers in test");
        int result= CalculatorService.addAnyNumbers(12,13,14);
        int expected=12+13+14;
        Assertions.assertEquals(expected,result,"Not a match");
    }


}
