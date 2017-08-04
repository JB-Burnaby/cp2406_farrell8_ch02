import javax.swing.*;

class Task2ab {

    public static void main(String[] args) {
        double qpg = 4.0; //Number of quarts per gallon

        String quarts = JOptionPane.showInputDialog("How many quarts are required?");
        int iquarts = Integer.parseInt(quarts);
        JOptionPane.showMessageDialog(null, "The number of Quarts required for the job is: "+ quarts +
                "\nThe number of gallons required for the job is: " + (iquarts/qpg));
    }
}

