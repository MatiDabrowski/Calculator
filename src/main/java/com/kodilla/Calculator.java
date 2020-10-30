package com.kodilla;

public class Calculator {
    int firstInt;
    int secondInt;
    int result;
    public Calculator(int firstInt, int secondInt){
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public void add(){
        result = this.firstInt + this.secondInt;
        System.out.println(result);
    }
    public void substraction(){
        result = this.firstInt - this.secondInt;
        System.out.println(result);
    }
}
