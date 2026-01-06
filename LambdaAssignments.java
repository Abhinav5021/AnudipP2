import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaAssignments {
    public static void main(String[] args) {
        
        // ---------------- Assignment 1: Arithmetic Operations ----------------
        int a = 20, b = 5;

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtract = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        BiFunction<Integer, Integer, Double> divide = (x, y) -> (y != 0) ? (double)x / y : Double.NaN;

        System.out.println("Arithmetic Operations:");
        System.out.println(a + " + " + b + " = " + add.apply(a, b));
        System.out.println(a + " - " + b + " = " + subtract.apply(a, b));
        System.out.println(a + " * " + b + " = " + multiply.apply(a, b));
        System.out.println(a + " / " + b + " = " + divide.apply(a, b));

        System.out.println();

        // ---------------- Assignment 2: String Manipulations ----------------
        String str = "Hello Lambda";

        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, String> toLower = s -> s.toLowerCase();
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();

        System.out.println("String Manipulations:");
        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + toUpper.apply(str));
        System.out.println("Lowercase: " + toLower.apply(str));
        System.out.println("Reversed: " + reverse.apply(str));
    }
}