package SumCalculator;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {

        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {

        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {

        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {

        if (firstNumber == 0 || secondNumber == 0) {
            return 0;
        } else {
            return (firstNumber / secondNumber);
        }
    }
}

//
//        *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
//        *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
//        *Method named setFirstNumber with one parameter of type double, it needs to set the value of the
//        firstNumber field.
//        *Method named setSecondNumber with one parameter of type double, it needs to set the value of the
//        secondNumberfield.
//        *Method named getAdditionResult without any parameters, it needs to return the result of adding the
//        field values of firstNumber and secondNumber.
//        *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting
//        the field values of secondNumber from the firstNumber.
//        *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying
//        the field values of firstNumber and secondNumber.
//        *Method named getDivisionResult without any parameters it needs to return the result of dividing the field
//        values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
//