package com.kodilla.spring.basic.spring_dependency_injection.homework;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Calculator {

   @NonNull private Display display;

    public String add(double a, double b) {
        return this.display.display(a + b);
    }

    public String subtract(double a, double b) {
        return this.display.display(a - b);
    }

    public String multiply(double a, double b) {
        return this.display.display(a * b);
    }

    public String divide(double a, double b) {
        if (b != 0) {
            return this.display.display(a / b);
        } else {
            return this.display.displayWarning();
        }
    }
}