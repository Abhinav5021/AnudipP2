import java.util.HashMap;

public class HashMap1 {
     private int ID;
    private String Name;

    HashMap1(int id,String name){
        ID = id;
        Name = name;
    }

    public String toString(){
        return "\n id : "+ ID +" name : "+ Name +" \n";
    }
    
    public static void main(String[] args) {
        HashMap1 h = new HashMap1(1, "Abhinav");
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1, "Abhinav");
        hm.put(2, "Shivam");

        System.out.println(hm);
        System.out.println(hm.get(1));
        System.out.println(hm.containsKey(2));
    }
    
}

