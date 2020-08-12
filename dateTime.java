import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

public class dateTime{
	public static void main(String[] args) {

		//type 1:
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("Date & Time : "+dtf.format(now));

		//type 2:
		System.out.println("Date        : "+java.time.LocalDate.now());  

		//type 3:
		System.out.println("Time        : "+java.time.LocalTime.now());  

		//type 4:
		System.out.println("Date & Time : "+java.time.LocalDateTime.now());  

		//type 5:
		System.out.println("Date & Time : "+java.time.Clock.systemUTC().instant());  

		//type 6:
		java.util.Date date=new java.util.Date();  
		System.out.println("Date & Time : "+date); 

		
	}
}