import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAssignments {
    public static void main(String[] args) {
        
        System.out.println("Assignment 1: HashMap Example");
        HashMap<Integer, String> map = new HashMap<>();


        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");


        System.out.println("HashMap Elements: " + map);

        System.out.println();

        // ---------------- Assignment 2: Cricketer scores using Map ----------------
        System.out.println("Assignment 2: Cricketer Scores Example");
        Map<String, Integer> cricketerScores = new HashMap<>();


        cricketerScores.put("Virat Kohli", 85);
        cricketerScores.put("Rohit Sharma", 102);
        cricketerScores.put("MS Dhoni", 76);
        cricketerScores.put("Sachin Tendulkar", 120);


        System.out.println("Cricketer Scores: " + cricketerScores);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter batsman name to search: ");
        String name = sc.nextLine();

        if (cricketerScores.containsKey(name)) {
            System.out.println(name + "'s Score: " + cricketerScores.get(name));
        } else {
            System.out.println("Batsman not found in records.");
        }

        sc.close();
    }
}