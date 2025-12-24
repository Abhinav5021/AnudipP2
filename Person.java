public class Person {
    String Name ;
    int Age;
    Person(String name, int age){
        Name = name;
        Age = age;
    }
    public static void main(String args[]){
        String Name1 = "Abhinav", Name2 = "Shivam";
        int age1 = 21, age2 = 22;
        Person p1 = new Person(Name1, age1);
        Person p2 = new Person(Name2, age2);
        System.out.println("Person 1 name is : "+p1.Name+" Roll number is : "+p1.Age);
        System.out.println("Person 2 name is : "+p2.Name+" Roll number is : "+p2.Age);
    }
}