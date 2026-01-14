import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApplication extends JFrame {
    
    // Variable to store the current count
    private int currentCount = 0;
    
    public CounterApplication() {
        // 1. Setup the Frame (Window)
        setTitle("Counter Application");
        setSize(300, 150); // Set a reasonable size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // FlowLayout places components in a row
        
        // 2. Create the Components
        JButton clickButton = new JButton("Click Me!");
        JLabel countLabel = new JLabel("Count: " + currentCount);
        
        // 3. Implement ActionListener
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Increment the counter
                currentCount++;
                
                // Update the JLabel with the new count
                countLabel.setText("Count: " + currentCount);
            }
        });
        
        // 4. Add components to the Frame
        add(clickButton);
        add(countLabel);
        
        // Center the window on the screen and make it visible
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application safely on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CounterApplication();
            }
        });
    }
}