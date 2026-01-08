import java.util.HashSet;

class Student1{
    private int ID;
    private String Name;

    Student1(int id,String name){
        ID = id;
        Name = name;
    }
    public String toString(){
        return ID+" "+Name;
    }
    
}

public class StudentHash {

    public static void main(String[] args) {

        Student1 s1 = new Student1(1," Abhinav");
        Student1 s2 = new Student1(2, "Shivam");

        HashSet <Student1> hs = new HashSet<Student1>();
        hs.add(s1);
        hs.add(s2);
        
        System.out.println(hs);
    }
    
}
