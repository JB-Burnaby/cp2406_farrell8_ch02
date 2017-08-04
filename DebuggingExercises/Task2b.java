import javax.swing.*;

public class Task2b {

    public static void main(String[] args){
        double km = 1.852;
        double mile = 1.150779;
        float naut = 10;

        JOptionPane.showMessageDialog(null,"Distance in km: " + (naut*km) + "\nDistance in miles:" +
                 (mile*naut));
    }
}
