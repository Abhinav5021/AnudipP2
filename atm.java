import java.util.Scanner;

class data{
    
    private int cardno = 123456789;
    private int pin = 1234;
    private int balance = 10000;

    public int getCardno() {
        return cardno;
    }
    public int getPin() {
        return pin;
    }


    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

}

public class atm {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    data d = new data();

        if(new atm().validate(sc,d)){
            System.out.println("Welcome to the ATM!");
            System.out.println("---------------------");
            boolean loop = true;
            while(loop){

                System.out.println("Welcome to the ATM Services : ");
                System.out.println("-------------------------------");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Deposit Cash");
                System.out.println("4. Exit");
                System.out.println("Enter your choice : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your Current Balance is : " + d.getBalance());
                        break;

                    case 2:
                        System.out.println("Enter the amount to withdraw : ");
                        int withdrawAmount = sc.nextInt();
                        if(withdrawAmount <= 0){
                            System.out.println("Invalid Withdrawal Amount.");
                            break;
                        } else if (withdrawAmount <= d.getBalance()) {
                            d.setBalance(d.getBalance() - withdrawAmount);
                            System.out.println("Please collect your cash.");
                            System.out.println("----------------------------");
                            System.out.println("Your New Balance is : " + d.getBalance());
                        } else {
                            System.out.println("Insufficient Balance.");
                        }
                        break;

                    case 3:
                        System.out.println("Enter the amount to deposit : ");
                        int depositAmount = sc.nextInt();
                        if(depositAmount <= 0){
                            System.out.println("Invalid Deposit Amount.");
                            break;
                        }
                        else{
                            d.setBalance(d.getBalance() + depositAmount);
                            System.out.println("Deposit Successful.");
                            System.out.println("-------------------");
                            System.out.println("Your New Balance is : " + d.getBalance());
                        }
                        
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        loop = false;    
                        break;            
                    default:
                        System.out.println("Invalid Choice. Please try again.");
                        break;
                }
            }
        }
        else{
            System.out.println("Access Denied.");
        }
        sc.close();
    }

    boolean validate(Scanner sc, data d){
        System.out.println("ATM Login Details:");
        System.out.println("-------------------"    );
        System.out.println("Enter Your Card Number :");
        int enteredCardNo = sc.nextInt();
        System.out.println("Enter Your PIN :");
        int enteredPin = sc.nextInt();
        if(enteredCardNo == d.getCardno() && enteredPin == d.getPin()){
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid Card Number or PIN.");
            return false;
        }
    }
    
}