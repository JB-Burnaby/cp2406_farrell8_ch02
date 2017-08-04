import javax.swing.*;

public class Eggs {
    public static void main(String[] args){
        double dozenCost = 3.25;
        double eggcost = 0.45;

        int eggs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of eggs you would like to order"));
        int dozen = eggs/12;
        int remainder = eggs%12;
        double totalCost = (dozen*dozenCost) + (remainder * eggcost);

        JOptionPane.showMessageDialog(null, "You ordered " + eggs + " eggs. That's " + dozen +
        " dozen at $3.25 per dozen and " + remainder + " lose eggs at 45 cents each for a total of $" + totalCost);
    }
}
