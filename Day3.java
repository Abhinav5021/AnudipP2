import java.util.Scanner;
public class Day3 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numarator : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Denominator : ");
        int num2 = sc.nextInt();
        
        System.out.println(num1/num2);
        System.out.println("Hello");
        sc.close();
    }
}

//Exception : 
// Any unwanted or unexpected event that disturbs the normal flow of program is called Exception

//Output : 

// PS D:\Project\AnudipP2> cd "d:\Project\AnudipP2\" ; if ($?) { javac Day3.java } ; if ($?) { java Day3 }
// Enter Numarator : 
// 11
// Enter Denominator : 
// 11
// 1
// Hello
// PS D:\Project\AnudipP2> cd "d:\Project\AnudipP2\" ; if ($?) { javac Day3.java } ; if ($?) { java Day3 }
// Enter Numarator : 
// 11
// Enter Denominator : 
// 0
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Day3.main(Day3.java:12)
// PS D:\Project\AnudipP2> 