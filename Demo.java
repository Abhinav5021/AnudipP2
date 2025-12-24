public class Demo{
    String Name;
    int Roll;
    Demo(String s, int a){
        Name = s;
        Roll = a;
    }
    public static void main(String args[]){
        Demo d = new Demo("Abhinav", 37);
        System.out.println("My name is : "+ d.Name +" & My Roll Number is : " + d.Roll);
        // int g = null;
        Integer g = null;
    }
}