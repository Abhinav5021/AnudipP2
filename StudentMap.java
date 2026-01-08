import java.util.HashMap;

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

public class StudentMap {

    public static void main(String[] args) {

        Student s1 = new Student(1," Abhinav");
        Student s2 = new Student(2, "Shivam");

        HashMap <Integer,Student> hm = new HashMap<Integer,Student>();
        hm.put(1,s1);
        hm.put(2,s2);
        
        System.out.println(hm);
    }
    
}
