import java.util.Scanner;
public class Problem {
    String Name;
    int age;
    double salary;
    public Problem(String Name, int age, double salary){
        this.Name=Name;
        this.age=age;
        this.salary=salary;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age = sc.nextInt();
        System.out.println("Enter Your Name : ");
        sc.nextLine();
        //sc.nextLine() is used here because after integer string reads (Enter) instead of name.
        String Name = sc.nextLine();
        System.out.println("Enter Your salary : ");
        double salary = sc.nextDouble();
        Problem p = new Problem(Name, age, salary);
        sc.close();
        System.out.println("Name : "+p.Name+" Age : "+p.age+" Salary : "+p.salary);
    }
}
