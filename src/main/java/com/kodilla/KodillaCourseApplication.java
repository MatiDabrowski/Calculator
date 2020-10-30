package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);

        Calculator calc = new Calculator(1,2);
        calc.add();
        calc.substraction();
    }

}
