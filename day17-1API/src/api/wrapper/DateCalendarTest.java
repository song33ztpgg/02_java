package api.wrapper;

import java.time.Year;
import java.util.Calendar;
import java.util.Date; 
//import static

public class DateCalendarTest {

	public static void main(String[] args) {

		System.out.println(new Calendar(2019-1900, 8, 1));
		Calendar = Calendar.getInstance(); 
		System.out.println(Calendar.get(Calendar, YEAR) + "년"  + 
						   Calendar.get(Calendar, MONTH) + "월" +
						   Calendar.get(Calendar, DAY_OF_MONTH) + "일" ); 
		Calendar.set(2019, 8, 1); 
		System.out.println(Calendar.get(Calendar, YEAR) + "년"  + 
						   Calendar.get(Calendar, MONTH) + "월" +
						   Calendar.get(Calendar, DAY_OF_MONTH) + "일" );
	}

}
