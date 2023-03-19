package SimpleCalculator;

import java.util.Scanner;

class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return (this.firstNumber);
    }

    public double getSecondNumber() {
        return (this.secondNumber);
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult () {
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResult () {
        return (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult () {
        return (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResult () {
        if (this.secondNumber == 0) return 0;
        return (this.firstNumber / this.secondNumber);
    }
}
public class Calculator {
	public static void main(String[] args) {
		double fn,sn;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 for test code(or)enter any other number for user input: ");
		n=sc.nextInt();
		if(n==1) 
		{
			SimpleCalculator calculator = new SimpleCalculator();
			calculator.setFirstNumber(5.0);
			calculator.setSecondNumber(4);
			System.out.println("add= " + calculator.getAdditionResult());
			System.out.println("subtract= " + calculator.getSubtractionResult());
			calculator.setFirstNumber(5.25);
			calculator.setSecondNumber(0);
			System.out.println("multiply= " + calculator.getMultiplicationResult());
			System.out.println("divide= " + calculator.getDivisionResult());
		}
		else {
		System.out.print("Enter the first number: ");
		fn=sc.nextDouble();
		System.out.print("Enter the second number: ");
		sn=sc.nextDouble();
		
        SimpleCalculator cal = new SimpleCalculator();

        cal.setFirstNumber(fn);
        cal.setSecondNumber(sn);
        System.out.println("add= "+ cal.getAdditionResult());
        System.out.println("subtract= "+cal.getSubtractionResult());
        System.out.println("multiply= "+cal.getMultiplicationResult());
        System.out.println("divide= "+cal.getDivisionResult());
		}
	}
}