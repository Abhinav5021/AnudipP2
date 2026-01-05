import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing1 implements ActionListener {
    // Declare input field as instance variable
    private JTextField inputname;
    private JButton button;
    private JButton button1;

    public Swing1() {
        JFrame JF = new JFrame("Swing Example");
        JF.setSize(500, 500);
        JF.setLayout(null);

        JLabel name = new JLabel("Enter Your Name : ");
        name.setBounds(50, 50, 200, 20);
        JF.add(name);

        // Use JTextField for single-line input
        inputname = new JTextField();
        inputname.setBounds(50, 90, 200, 20);
        JF.add(inputname);

        button = new JButton("Submit");
        button.setBounds(50, 130, 100, 20);
        button.addActionListener(this);
        JF.add(button);

        button1 = new JButton("Click");
        button1.setBounds(150, 130, 100, 20);
        button1.addActionListener(this);
        JF.add(button1);

        JF.setVisible(true);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Swing1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get text from JTextField
       if (e.getSource() == button) {
            String Name = inputname.getText();
            System.out.println("Your Name : "+Name);
        } else if (e.getSource() == button1) {
            button1.setText("Bye Bye"); // change button text
        }

    }
}
// JFrame is a container (class)
// JFrame jf = new JFrame();
// jf.setSize(400, 400);
