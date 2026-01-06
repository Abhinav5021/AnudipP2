import java.util.Scanner;

public class Stack1 {
    private int[] arr;
    private int top;
    private int Capacity;

    public Stack1(int size){
        arr = new int[size];
        Capacity = size;
        top=-1;
    }

    public void push(int a){
        if(isFull()){
            throw new RuntimeException("Stack Overflow!! Unable to Push "+a);
        }
        else{
            arr[++top]=a;
            System.out.println("Value Pushed is : "+a);
        }
    }

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack Underflow!! Unable to Pop Element");
        }
        else{
            System.out.println("Popped Element is : "+arr[top]);
            top=top-1;
        }
    }
    
    public void peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty...");
        }
        else{
            System.out.println("Top Element is : "+arr[top]);
        }
    }




    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == Capacity - 1;
    }

    public int size() {
        return top + 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Capacity : ");
        int a = sc.nextInt();
        Stack1 s = new Stack1(a);
        boolean b = true;
        while (b) {
            System.out.println("Select the Operation : ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            try{
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to Push : ");
                    int input = sc.nextInt();
                    s.push(input);
                    break;

                case 2:
                    s.pop();
                    break;
                
                case 3:
                    s.peek();
                    break;

                case 0:
                    b = false;
                    break;
            
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}
