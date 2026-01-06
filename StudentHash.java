import java.util.HashSet;

class Student{
    private int ID;
    private String Name;

    Student(int id,String name){
        ID = id;
        Name = name;
    }
    public String toString(){
        return ID+" "+Name;
    }
    
}

public class StudentHash {

    public static void main(String[] args) {

        Student s1 = new Student(1," Abhinav");
        Student s2 = new Student(2, "Shivam");

        HashSet <Student> hs = new HashSet<Student>();
        hs.add(s1);
        hs.add(s2);
        
        System.out.println(hs);
    }
    
}
