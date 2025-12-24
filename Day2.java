import java.util.Scanner;

public class Day2 {
    int rollNo;
    String Name;

    public Day2(int rollNo,String Name){
        this.rollNo=rollNo;
        this.Name=Name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String Name = sc.nextLine();
        System.out.println("Enter Your Roll : ");
        int rollNo = sc.nextInt();
        Day2 p = new Day2(rollNo, Name);
        System.out.println("Name : "+p.Name+" Roll : "+p.rollNo);
        sc.close();
    }
}
