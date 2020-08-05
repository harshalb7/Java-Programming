import java.util.*;
import java.util.Scanner;

public class studentInfo{
		int rollNo,std;
		long prn,phoneNo;
		String name,homeTown;
		char gender;

		Scanner cin = new Scanner(System.in);

		public void getInfo(){
			System.out.print("Enter Roll Number: ");
			rollNo = cin.nextInt();
			System.out.print("Enter Name: ");
			name = cin.next();
			System.out.print("Enter Gender: ");
			gender = cin.next().charAt(0);
			System.out.print("Enter prn Number: ");
			prn = cin.nextInt();
			System.out.print("Enter Phone Number: ");
			phoneNo = cin.nextInt();
			System.out.print("Enter Home Town: ");
			homeTown = cin.next();
			
		}

		public void displayInfo(){
			System.out.println(rollNo+"\t"+name+"\t"+gender+"\t"+prn+"\t"+phoneNo+"\t"+homeTown);
		}
	
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter Number of Record: ");
		int no = cin.nextInt();
		studentInfo[] sI = new studentInfo[no];
		
		for ( int i = 0; i < no ; i++ ){
			
			sI[i] = new studentInfo();
			sI[i].getInfo();
		}

		System.out.println("Roll No"+"\t"+"Name"+"\t"+"Gender"+"\t"+"PRN"+"\t"+"Phone No"+"\t"+"Home Town");
		for(int i = 0; i< no; i++){
			sI[i].displayInfo();
		}
	}
}