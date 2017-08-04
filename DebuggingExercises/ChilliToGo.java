import javax.swing.*;

public class ChilliToGo {
    public static void main(String[] args){
        int adultMeal = 7;
        int childMeal = 4;
        int adultMealNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number of adult meals you would like."));
        int childMealNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number of child meals you would like."));

        JOptionPane.showMessageDialog(null,
                "Total money collected for adult meals: $" + (adultMealNumber * adultMeal)+
            "\nTotal money collected for childern's meals: $" + (childMealNumber * childMeal)+
            "\nTotal money collected: $" + ((adultMeal*adultMealNumber)+(childMeal*childMealNumber)));
    }
}
