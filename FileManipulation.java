import java.io.*;
public class FileManipulation {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\abhin\\Downloads\\abc.txt");
        String s = "Abhinav Sujit Pawar";
        fw.write(s);
        fw.flush();
        System.out.println("executed...");

        int count = 0;  // to count characters

        try (FileReader fr = new FileReader("C:\\Users\\abhin\\Downloads\\abc.txt")) {
            int ch;
            
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); 
                count++;
            }
            System.out.println("\n\nTotal number of characters: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        
    }
    
}
