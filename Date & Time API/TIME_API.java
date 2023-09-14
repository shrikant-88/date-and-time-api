/**
 * java.Time
 */
import java.time.*;
public class TIME_API {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);
       int month  =  date.getMonthValue();
       int day = date.getDayOfMonth();
       int year = date.getYear();

       System.out.println("todays date = "+day+"/"+month+"/"+year);

       int hour = time.getHour();
       int minutes = time.getMinute();
       int sec = time.getSecond();

       System.out.println("time right now = "+hour+":"+minutes+":"+sec);
       

    }
}