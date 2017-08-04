import javax.swing.*;

public class InchesToFeetInteractive {

       public static void main(String[] args){
           String inches = JOptionPane.showInputDialog(null, "Enter the number of inches to convert");
           int iinches = Integer.parseInt(inches);
           int feet = iinches/12;
           JOptionPane.showMessageDialog(null, feet + " feet and " + (iinches%12) + "inches");
      }
}

