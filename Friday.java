import java.time.LocalDate;
import java.time.LocalTime;

public class Friday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.minusDays(1));
        System.out.println(today.minusMonths(2));
        LocalTime time =LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }
}
