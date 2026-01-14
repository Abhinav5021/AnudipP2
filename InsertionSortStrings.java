import java.util.Scanner;

public class InsertionSortStrings {
    
    // Method to perform insertion sort on an array of strings
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            // Compare strings lexicographically using compareTo()
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        // Input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Sort using insertion sort
        insertionSort(arr);

        // Display sorted list
        System.out.println("\nSorted strings in alphabetical order:");
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}