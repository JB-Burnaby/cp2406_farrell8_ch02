import javax.swing.*;

public class ChilliToGoProfit {
    public static void main(String[] args){
        int adultMeal = 7;
        int childMeal = 4;
        double childLoss = 3.1;
        double adultLoss = 4.35;

        int adultMealNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number of adult meals you would like."));
        int childMealNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the number of child meals you would like."));


        double totalAdultLoss = adultLoss*adultMealNumber;
        double totalChildLoss = childLoss*childMealNumber;
        double totalAdultProfit = (adultMealNumber * adultMeal) - totalAdultLoss;
        double totalChildCost = (childMealNumber * childMeal) - totalChildLoss;

        JOptionPane.showMessageDialog(null,
                    "Total profit for adult meals: $" + totalAdultProfit +
                     "\nTotal profit for childern's meals: $" + totalChildCost +
                     "\nTotal profit: $" + (totalAdultProfit + totalChildCost));
        }
    }


