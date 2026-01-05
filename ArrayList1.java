import java.util.ArrayList;

public class ArrayList1 {
        public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Second element: " + numbers.get(1));

        numbers.set(2, 35);
        System.out.println("Updated list: " + numbers);

        numbers.remove(1); 
        System.out.println("After removal: " + numbers);

        System.out.println("Iterating through list:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        
        System.out.println("Size of list: " + numbers.size());
    }

}


// Duplicates are Allowed 
// Null Allowed 
// Heterogenious Elements are allowed  ( Multiple Devloper works if one who made goes then other cant understand )
// Default Capacity is 10, while inserting 11th element new list will be made 
