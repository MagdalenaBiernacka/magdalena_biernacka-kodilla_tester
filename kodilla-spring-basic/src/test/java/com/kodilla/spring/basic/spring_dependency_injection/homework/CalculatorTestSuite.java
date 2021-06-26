package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void addedTwoValues() {

        String result = bean.add(5.0,5.0);
        assertEquals("Result: 10.0", result);
    }

    @Test
    public void subtractTwoValues() {
        String result = bean.subtract(5.0, 3);
        assertEquals("Result: 2.0", result);
    }

    @Test
    public void multiplyTwoValues() {
        String result = bean.multiply(3.0, 3.0);
        assertEquals("Result: 9.0", result);
    }

    @Test
    public void divideTwoValues() {
        String result = bean.divide(12.0, 6.0);
        assertEquals("Result: 2.0", result);
    }

    @Test
    public void returnWarningMessageWhenDivideByZero() {
        String result = bean.divide(123.0, 0.0);
        assertEquals("Error", result);
    }
}