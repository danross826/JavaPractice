public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){

        return this.firstNumber;
    }

    public double getSecondNumber(){

        return this.secondNumber;
    }

    public void setFirstNumber(double number){

        this.firstNumber = number;
    }

    public void setSecondNumber(double number){

        this.secondNumber = number;
    }

    public double getAdditionResult(){

        double result = this.firstNumber + this.secondNumber;

        return result;
    }

    public double getSubtractionResult(){

        double result = this.firstNumber - this.secondNumber;

        return result;
    }

    public double getMultiplicationResult(){

        double result = this.firstNumber * this.secondNumber;

        return result;
    }

    public double getDivisionResult(){

        if (this.secondNumber == 0){

            return 0;
        }

        double result = this.firstNumber / this.secondNumber;

        return result;
    }
}