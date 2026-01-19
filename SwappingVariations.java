import java.util.Arrays;

public class SwappingVariations {

    public static void main(String[] args) {
        System.out.println("--- 1. Temp Variable ---");
        swapWithTemp(10, 20);

        System.out.println("\n--- 2. Add/Sub ---");
        swapAddSub(10, 20);

        System.out.println("\n--- 3. Mul/Div ---");
        swapMulDiv(10, 20);

        System.out.println("\n--- 4. XOR (Bitwise) ---");
        swapXOR(10, 20);

        System.out.println("\n--- 5. One-Liner ---");
        swapOneLiner(10, 20);

        System.out.println("\n--- 6. Strings ---");
        swapStrings("Java", "Code");

        System.out.println("\n--- 7. Array Elements ---");
        swapArray(new int[]{1, 2, 3, 4, 5}, 0, 4);
    }

    // 1. Standard approach (Recommended)
    public static void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }

    // 2. Arithmetic (No temp variable)
    public static void swapAddSub(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);
    }

    // 3. Geometric (Risk of zero division/overflow)
    public static void swapMulDiv(int a, int b) {
        if (b == 0 || a == 0) return; 
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a: " + a + ", b: " + b);
    }

    // 4. Bitwise XOR (Fastest for integers)
    public static void swapXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + ", b: " + b);
    }

    // 5. Single statement hack
    public static void swapOneLiner(int a, int b) {
        b = (a + b) - (a = b);
        System.out.println("a: " + a + ", b: " + b);
    }

    // 6. String swapping using substrings
    public static void swapStrings(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a: " + a + ", b: " + b);
    }

    // 7. Swapping inside an array
    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr));
    }
}