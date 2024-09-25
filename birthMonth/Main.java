import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //variables
        int birthMonth;
        //data collection
        System.out.println("Input your birth month.");
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is " + birthMonth + ".");
            }
            else {
                System.out.println("Incorrect value entered: " + birthMonth);
                System.exit(0);
            }

        }
        else {
            System.out.println("Incorrect value type");
            System.exit(0);
        }
    }
}