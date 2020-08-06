import java.util.*;
import java.util.Scanner;

class birthDate{

	int date, month, year;
	Scanner cin = new Scanner(System.in);

	public int checkYear(int yy){
		do{
			try{
				if( yy <= 999 || yy > 2999)
					throw new Exception();
			}

			catch(Exception e){

				System.out.println("Enter Year is Invalid.....Re-Enter Year ");
				System.out.print("Enter Year: ");
				yy = cin.nextInt();
			}
		}while( yy <= 999 || yy > 2999 );

		return yy;
	}

	public int checkMonth(int mm){
		do{

			try{
				if( mm < 1 || mm >12)
					throw new Exception();
			}
			catch(Exception e){
				System.out.println("Enter Month is Invalid.....Re-Enter Month ");
				System.out.print("Enter Month: ");
				mm = cin.nextInt();
			}
		}while( mm < 1 || mm >12);

		return mm;
	}
	public void getBirthDate(){
		System.out.print("Enter Year: ");
		year = cin.nextInt();

		year = checkYear(year);
		//System.out.println("Enter Year: "+year);

		System.out.print("Enter Month: ");
		month = cin.nextInt();

		month = checkMonth(month);
		//System.out.println("Enter Month: "+month);

		System.out.print("Enter Date: ");
		date = cin.nextInt();
		
		date = checkDate(date,month,year);
		//System.out.println("Enter Month: "+date);

		String date1  = Integer.toString(date);
		if(date < 10){
			date1 = '0'+date1;
		}
		String month1 = Integer.toString(month);
		if(month < 10){
			month1 = '0'+month1;
		}
		String year1  = Integer.toString(year);
		System.out.println(" ");
		System.out.print("Birth Date: "+date1 +"-"+month1+'-'+year1);

	}

	public int checkDate(int dd, int mm, int yy){
		do{
			try{
				if(checkDay(dd, mm, yy) == false)
					throw new Exception();
			}

			catch(Exception e){
				System.out.println("Enter Date is Invalid.....Re-Enter Date ");
				System.out.print("Enter Date: ");
				dd = cin.nextInt();
			}
		}while(checkDay(dd, mm, yy) == false);

		return dd;
	}
	public boolean leapYear(int yy){
		if ( yy % 4 == 0) {
			return true;
		}
		else
			return false;
	}

	public boolean checkDay(int dd, int mm, int yy){
		if( leapYear(yy) == true){
			if(mm == 2){
				if( dd <= 0 || dd >=30)
					return false;
			}
			else{
				if( checkMdate( mm ) == true){
					if( dd <= 0 || dd > 30)
						return false;
				}
				else{
					if( dd <= 0 || dd > 31)
						return false;
				}
			}
		}
		else{
			if(mm == 2){
				if( dd <= 0 || dd >=29)
					return false;
			}
			else{
				if( checkMdate( mm ) == true){
					if( dd <= 0 || dd > 30)
						return false;
				}
				else{
					if( dd <= 0 || dd > 31)
						return false;
				}
			}
		}
		return true;
	}

	public boolean checkMdate(int mm){
		if(mm % 2 == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {

		birthDate bD = new birthDate();
		bD = new birthDate();
		bD.getBirthDate();
		System.out.println(" ");
	}
}