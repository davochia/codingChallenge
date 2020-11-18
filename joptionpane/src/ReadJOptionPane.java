import javax.swing.*;

public class ReadJOptionPane {
    public static void main(String[] args) {
        String name;
        String surname;

        int num1;
        int num2;
        String input;
        double avg;

        input = JOptionPane.showInputDialog("Enter your first num:");
        num1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter your second num:");
        num2 = Integer.parseInt(input);

        avg = (num1 + num2) / 2.0;

        JOptionPane.showMessageDialog(null, avg);


        name = JOptionPane.showInputDialog("Enter your first name:");
        surname = JOptionPane.showInputDialog("Enter your surname first name:");

        JOptionPane.showMessageDialog(null, name + " " + surname);
    }
}
