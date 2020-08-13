import java.util.Scanner;
//declaration main class
class mathOperation{
	
	//function to return addition
	public static float addition(float num1, float num2){
		return (num1 + num2);
	}
	
	//function to return summation
	public static float summation(float num1, float num2){
		return (num1 - num2);
	}
	
	//function to return multiplication
	public static float multiplication(float num1, float num2){
		return (num1 * num1) ;
	}
	
	//function to return division
	public static float division(float num1, float num2){
		if(num2 != 0){  // check for divide by zero errror
			return (num1/num2);
		}
		else{
			System.out.println("Divide by ZERO error");
			return 0;
		}
	}

	public static void main(String[] args) {
		float num1, num2;         // variable declaration
		Scanner c=new Scanner(System.in);
		System.out.print(" Enter Number 1: ");
		num1 = c.nextInt(); //input 1st number num1

		System.out.print(" Enter Number 2: ");
		num2 = c.nextInt(); //input 2nd number num2

		float add = addition(num1, num2);        //call for addition function
		float sum = summation( num1, num2);	 //call for summation function
		float mul = multiplication( num1, num2); //call for multiplication function
		float div = division( num1, num2);       //call for division function

		System.out.println(" Addition is      : "+add); //Print Addition
		System.out.println(" Subtraction is   : "+sum); //Print Subtraction
		System.out.println(" Multiplication is: "+mul); //Print Multilpication
		System.out.println(" Division is      : "+div); //Print Division
	}
};
