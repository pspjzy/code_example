package clas_s.sum_Calculator;

public class SimpleCalculator {
    private static double firstNumber;
    private static double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult(){
        if(firstNumber==0 || secondNumber == 0){
            return 0.0;
        }
        return firstNumber*secondNumber;
    }

    public double getDivisionResult(){
        if(firstNumber==0 || secondNumber == 0){
            return 0.0;
        }
        return firstNumber/secondNumber;
    }
}
