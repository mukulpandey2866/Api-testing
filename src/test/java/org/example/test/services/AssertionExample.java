package org.example.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AssertionExample {

//    Assertion:- evaluate expected == actual

    @Test
    public void Test_1(){
        System.out.println("Testing some assertion methods");

//        Assertions.assertEquals(expected,result); // it matches the value only


        //        double result=10;
    //        double expected=10;
//            Assertions.assertEquals(expected,result);  //  for values


    //        float result=10;
    //        Float expected=10.0f;
//            Assertions.assertEquals(expected,result);  // for values (data types)


//        int []result = {1,2,3,4,5,6,7,8,9,10};
//        int []expected = {1,2,3,4,5,6,7,8,9,10};
//        Assertions.assertArrayEquals(expected, result);  //for arrays


//        String expected=new String("Rahul"); //new object created
//        String result= new String("Rahul");  //new different object created with same value
//        Assertions.assertSame(expected,result);  // fails since those two are different objects with same values.

//        String expected="Rahul";
//        String result="Rahul";
//        Assertions.assertSame(expected,result);  // passed since both point to the same object, "Rahul" whcih is created only once here.

//        Assertions.assertNull();
//        Assertions.assertNotNull();


//        boolean value=true;
//        Assertions.assertTrue(value);

//            List<Integer> expected = Arrays.asList(1,2,3,4,5);
//            List<Integer> result = Arrays.asList(1,2,3,4,5);
//            Assertions.assertIterableEquals(expected, result);
//        Assertions.assertThrows(RuntimeException.class, () -> {
//            System.out.println("This is a test exception");
//            throw new RuntimeException("This is a test exception");
//        });

        Assertions.assertTimeout(Duration.ofMillis(3000),() -> {
            Thread.sleep(2000);
        });

//        System.out.println("Testing done");
        System.out.println("Testing done for Runtimeexception throw");
//        similarly we can test for multiple options.

    }


}
