import java.util.Scanner;
class mathOperation{
	public static float addition(float num1, float num2){
		return (num1 + num2);
	}

	public static float summation(float num1, float num2){
		return (num1 - num2);
	}

	public static float multiplication(float num1, float num2){
		return (num1 * num1) ;
	}

	public static float division(float num1, float num2){
		if(num2 != 0){
			return (num1/num2);
		}
		else{
			System.out.println("Divide by ZERO error");
			return 0;
		}
	}

	public static void main(String[] args) {
		float num1, num2;
		Scanner c=new Scanner(System.in);
		System.out.print(" Enter Number 1: ");
		num1 = c.nextInt();

		System.out.print(" Enter Number 2: ");
		num2 = c.nextInt();

		float add = addition(num1, num2);
		float sum = summation( num1, num2);
		float mul = multiplication( num1, num2);
		float div = division( num1, num2);

		System.out.println(" Addition is      : "+add);
		System.out.println(" Subtraction is   : "+sum);
		System.out.println(" Multiplication is: "+mul);
		System.out.println(" Division is      : "+div);
	}
};