import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        System.out.println("*** Library ***");
        final float MAX_DISTANCE_KM = 3f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have a library card? (yes/no): ");
        String libraryCard = scanner.nextLine();
        boolean hasLibraryCard = libraryCard.equals("yes");

        System.out.println("Enter the distance to the library in km: ");
        float distance = Float.parseFloat(scanner.nextLine());
        boolean isClose = distance <= MAX_DISTANCE_KM;

        boolean canBorrow = hasLibraryCard || isClose;
        if (canBorrow) {
            System.out.println("You can borrow the book.");
        } else {
            System.out.println("You can't borrow the book.");
        }
    }
}
