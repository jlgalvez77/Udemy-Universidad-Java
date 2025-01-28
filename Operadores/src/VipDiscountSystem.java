import java.util.Scanner;

public class VipDiscountSystem {
    public static void main(String[] args) {
        System.out.println("*** VIP Discount System ***");
        final int NUMBER_OF_ITEMS = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of items: ");
        int items = Integer.parseInt(scanner.nextLine());
        System.out.println("Do you have a VIP card? (yes/no): ");
        String vipCard = scanner.nextLine();
        boolean isVip = vipCard.equals("yes");
        boolean isDiscount = items > NUMBER_OF_ITEMS && isVip;
        if (isDiscount) {
            System.out.println("You have a discount!");
        } else {
            System.out.println("You don't have a discount.");
        }
    }
}
