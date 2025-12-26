import java.util.Scanner;
public class ProbD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Digits : ");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter "+num+" Numbers : ");
        int sum=0;
        for(int i=0; i<num; i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Addition of digits is : "+sum);
        sc.close();
    }
}
//Sum of digits of array