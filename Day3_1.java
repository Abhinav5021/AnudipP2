import java.util.Scanner;

public class Day3_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numarator : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Denominator : ");
        int num2 = sc.nextInt();
        
        try{
        System.out.println(num1/num2);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Denominator can not be 0 ");
        }
        System.out.println("Hello");
        sc.close();
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