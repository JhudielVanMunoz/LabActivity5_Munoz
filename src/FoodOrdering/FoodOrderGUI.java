package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    public FoodOrderGUI() {
        ButtonGroup btnG = new ButtonGroup();
        btnG.add(rbNone);
        btnG.add(rb5);
        btnG.add(rb10);
        btnG.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc_order();
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setTitle("Food Ordering System");
        app.setSize(600, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void calc_order() {
        double total = 0;
        if (cPizza.isSelected()) {
            total += 100;
        }
        if (cBurger.isSelected()) {
            total += 80;
        }
        if (cFries.isSelected()) {
            total += 65;
        }
        if (cSoftDrinks.isSelected()) {
            total += 55;
        }
        if (cTea.isSelected()) {
            total += 50;
        }
        if (cSundae.isSelected()) {
            total += 40;
        }

        double discount = 0;
        if (rb5.isSelected()) {
            discount = 0.05;
        } else if (rb10.isSelected()) {
            discount = 0.1;
        } else if (rb15.isSelected()) {
            discount = 0.15;
        }

        total -= (total * discount);

        JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", total));
    }
}
