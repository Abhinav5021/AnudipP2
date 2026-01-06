import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;

public class Localization {
    public static void main(String[] args) {
        // --- Part 1: LocalDateTime formatting ---
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDate);

        System.out.println();

        // --- Part 2: Print months and days (Non-Leap Year) ---
        System.out.println("Months and Days (Non-Leap Year):");
        for (Month month : Month.values()) {
            int days = month.length(false);
            System.out.println(month + " -> " + days + " days");
        }
    }
}