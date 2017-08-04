public class Task2a {

    public static void main(String[] args) {
        double qpg = 4.0; //Number of quarts per gallon
        double qr = 18.0; // Number of quarts required for painting
        double qtg = qr/qpg; //Gallons required for a job

        System.out.println("The number of Quarts required for the job is: "+ qr +
                "\nThe number of gallons required for the job is: " + qtg);
    }
}
