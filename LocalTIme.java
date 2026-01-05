import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class LocalTIme {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getMonth());
        System.out.println(time.getYear());
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

    }
    
}
