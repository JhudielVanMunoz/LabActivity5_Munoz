package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void compute() {
        double first_n = Double.parseDouble(tfNumber1.getText());
        double second_n = Double.parseDouble(tfNumber2.getText());
        String op = cbOperations.getSelectedItem().toString();

        double result = 0;
        switch (op) {
            case "+":
                result = first_n + second_n;
                break;
            case "-":
                result = first_n - second_n;
                break;
            case "*":
                result = first_n * second_n;
                break;
            case "/":
                result = first_n / second_n;
                break;
        };

        lblResult.setText(Double.toString(result));
    }
}
