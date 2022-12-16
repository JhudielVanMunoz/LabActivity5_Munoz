package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkYear();
            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setTitle("Leap Year Checker");
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void checkYear() {
        int year = 0;
        try {
            year = Integer.parseInt(tfYear.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Input a valid number.");
            return;
        }

        boolean is_ly = false;
        if (year % 400 == 0) {
            is_ly = true;
        }
        else if (year % 100 == 0) {
            is_ly = false;
        }
        else if (year % 4 == 0) {
            is_ly = true;
        }

        JOptionPane.showMessageDialog(panel1, ( is_ly ? "Leap year" : "Not a leap year"));
    }
}