import java.util.Scanner;
import java.util.*;
class stringOperation{
	

	public static void concatinationOperator(String str1, String str2){ //concatination using + operator
		String str3 = str1 + str2;
		System.out.println("Concatination :"+str3);
	}

	public static void concatinationMethod(String str1, String str2){ //concatination using concat() method
		String str3 = str1.concat(str2);
		System.out.println("Concatination :"+str3);
	}

	public static void stringlength(String str1, String str2){
		System.out.println("Length of String "+str1+"is: "+str1.length());
		System.out.println("Length of String "+str2+"is: "+str2.length());
	}

	public static void lowerCaseandUpperCase(String str1, String str2){
		System.out.println("Lower Case of String "+str1+"is: "+str1.toLowerCase());
		System.out.println("Lower Case of String "+str2+"is: "+str2.toLowerCase());

		System.out.println("Upper Case of String "+str1+"is: "+str1.toUpperCase());
		System.out.println("Upper Case of String "+str2+"is: "+str2.toUpperCase());
	}

	public static void replaceCharacter(String str1, String str2){

		System.out.println("Replace a by z in String"+str1+"New String: "+str2.replace('a','z'));
		System.out.println("Replace h by m in String"+str2+"New String: "+str2.replace('h', 'm'));
	}

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		System.out.print(" Enter 1st String: ");
		String str1 = cin.nextLine();

		System.out.print(" Enter 2nd String: ");
		String str2 = cin.nextLine();

		concatinationMethod(str1, str2);
		concatinationOperator(str1, str2);
		stringlength(str1, str2);
		lowerCaseandUpperCase(str1, str2);
		replaceCharacter(str1, str2);
	}
};