package com.healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class xBMICalculatorTest {


    @Test
    void should_ReturnTrue_When_DietRecommended(){

        // given
        double weight = 89.0;
        double height = 1.72;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);


        //instead of:
//        assertTrue(BMICalculator.isDietRecommended(89.0,1.72));
    }
    @Test
    void should_ReturnFalse_When_DietNotRecommended(){

        // given
        double weight = 50.0;
        double height = 1.92;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertFalse(recommended);


        //instead of:
//        assertFalse(BMICalculator.isDietRecommended(50.0,1.92));
    }

    @Test
    void should_ThrowArithmeticException_When_HeightZero(){

        // given
        double weight = 0;
        double height = 0;

        //when
        Executable executable = () -> BMICalculator.isDietRecommended(weight,height);
            // we need to do this when testing for exceptions on 00 values because the exception
            // will be thrown before the assertion.
            // here we create an executable and pass it to the assertion so it can be executed.
        //then
        assertThrows(ArithmeticException.class, executable);

    }
}