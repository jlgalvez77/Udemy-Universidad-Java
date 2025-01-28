import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Value Inside Range ***");
        // Limits
        final int MIN = 0, MAX = 10;
        // Value
        System.out.println("Please enter a value between " + MIN + " and " + MAX + ": ");
        int date = Integer.parseInt(new Scanner(System.in).nextLine());
        // Check if the value is within the range
        boolean result = date >= MIN && date <= MAX;
        if (result) {
            System.out.println("The value is within the range.");
        } else {
            System.out.println("The value is not within the range.");
        }
    }
}
