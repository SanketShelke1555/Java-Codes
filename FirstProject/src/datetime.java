import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println("Current date:"+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current time:"+time);
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println("Cureent date and time is :"+datetime);
		
	}

}
