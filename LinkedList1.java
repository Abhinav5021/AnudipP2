import java.util.LinkedList;

public class LinkedList1 {
     public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);

        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());

        numbers.add(2, 25); 
        System.out.println("After insertion: " + numbers);

        numbers.removeFirst(); 
        numbers.removeLast();  
        System.out.println("After removals: " + numbers);

        System.out.println("Iterating through list:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("Size of list: " + numbers.size());
    }

}

//Legacy classes are Vector() and Stack();