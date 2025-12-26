import java.util.Scanner;
public class Day1 {
    String Name;
    int Age,Roll;
    Day1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        Name = sc.nextLine();
        System.out.println("Enter Age : ");
        Age = sc.nextInt();
        System.out.println("Enter Roll No. : ");
        Roll = sc.nextInt();
        sc.close();
    }
    public static void main(String[] args) {
        Day1 d1 = new Day1();
        Day1 d2 = new Day1();
        System.out.println("Name is "+d1.Name+" Age is "+d1.Age+" and Roll No. is : "+d1.Roll);
        System.out.println("Name is "+d2.Name+" Age is "+d2.Age+" and Roll No. is : "+d2.Roll);
    }
}