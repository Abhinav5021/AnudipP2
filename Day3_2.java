// import java.io.FileReader;
import java.util.Scanner;
public class Day3_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numarator : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Denominator : ");
        int num2 = sc.nextInt();

        String s = "Abhinav";
        // System.out.println(s.length());
        // This block will print null pointer exception as 'String s' is eligible for Garbage Collection
        System.out.println("Output : ");

        try{
        System.out.println(num1/num2);
        System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello");
        sc.close();

        // Runtime Exceptions and its classes are  Unchecked Exceptions 
        // Others are Checked Exceptions
        // FileReader r = new FileReader("abc.txt");

    }
}

// try{
//     //Risky Code
// }
// Catch(Exception e){
//     //Handling Code 
// }


// Various ways to print Exception Object 
    // 1. Catch ( Exception e ){
    //     System.out.println(e);
    // }

    // 2. Catch ( Exception e){
    //     System.out.println(e.getMessage());
    // }

    // 3. Catch ( Exception e){
    //     e.printStackTrace(); { Name , Description, Location}
    // }