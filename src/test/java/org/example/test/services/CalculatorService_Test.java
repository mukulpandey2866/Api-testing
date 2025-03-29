//package org.example.test.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorService_Test {
//
//    int counter =0;
//
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all testcases");
//        System.out.println("Started test: "+ new Date());
//    }
//
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each testcases");
//        counter = 0;
//    }
//    @After
//    public void afterEach(){
//        System.out.println("After each testcases");
//    }
//
//    @Test
//    public void addTwoNumbers_Test(){
//        for(int i=0;i<=20;i++)
//        {
//            counter+=i;
//        }
//        System.out.println("Addition test");
//        System.out.println("first value of counter: " + counter);
//        int result =CalculatorService.addTwoNumbers(10,40);
//        int expected=10+40;
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void subtractTwoNumbers_Test(){
//        for(int i=0;i<=10;i++)
//        {
//            counter+=i;
//        }
//        System.out.println("Subtraction test");
//        System.out.println("second value of counter: " + counter);
//        int result=CalculatorService.subtractTwoNumbers(10,40);
//        int expected=10-40;
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test (timeout = 2000)
//    public void multiplyTwoNumbers_Test() throws InterruptedException {
//        System.out.println("Multiplication test");
//        Thread.sleep(3000);
//        int result=CalculatorService.multiplyTwoNumbers(10,40);
//        int expected=10*40;
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void divideTwoNumbers_Test(){
//        System.out.println("Division test");
//        double result=CalculatorService.divideTwoNumbers(10,40);
//        double expected=10/40;
//        Assert.assertEquals(expected,result,0);
//    }
//
//    @Test
//    public void addAnyNumbers_Test(){
//        System.out.println("Series Addition test");
//        int result=CalculatorService.addAnyNumbers(10,40,30,20);
//        int expected=10+40+30+20;
//        Assert.assertEquals(expected,result);
//    }
//
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("After all test cases");
//        System.out.println("End all test cases: " + new Date());
//    }
//
//}

