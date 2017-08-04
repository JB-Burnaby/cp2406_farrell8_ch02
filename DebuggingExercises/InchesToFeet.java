import javax.swing.*;

public class InchesToFeet {
    public static void main(String[] args){
        int inches = 86;
        int feet = inches/12;
        JOptionPane.showMessageDialog(null, feet + " feet and " + (inches%12) + "inches");
    }
}
