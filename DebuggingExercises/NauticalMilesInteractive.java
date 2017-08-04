import javax.swing.*;

public class NauticalMilesInteractive {

    public static void main(String[] args){
        double km = 1.852;
        double mile = 1.150779;
        String naut = JOptionPane.showInputDialog("How many nautical miles?");
        int inaut =  Integer.parseInt(naut);
        JOptionPane.showMessageDialog(null,"Distance in km: " + (inaut*km) + "\nDistance in miles:" +
                (mile*inaut));
    }
}
