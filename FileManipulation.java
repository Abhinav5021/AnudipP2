import java.io.*;
public class FileManipulation {
    public static void main(String[] args) throws IOException {
        //File f = new File("C:\\Users\\abhin\\Downloads\\abc.txt");
        // System.out.println(f.exists());
        // System.out.println(f.createNewFile());
        // System.out.println(f.length());
        FileWriter fw = new FileWriter("C:\\\\Users\\\\abhin\\\\Downloads\\\\abc.txt");
        char[] ch ={'a','b','c'};
        String s = ":Abinaaaaaaav..! ";
        fw.write(s);
        fw.flush();
        System.out.println("executed...");
        
    }
    
}
