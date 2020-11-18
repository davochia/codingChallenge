package com.wisekingdavid;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return secondNumber + firstNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return secondNumber * firstNumber;
    }

    public double getDivisionResult(){
        if (secondNumber == 0 || firstNumber == 0){
            return 0;
        }else return firstNumber / secondNumber;
    }
}
