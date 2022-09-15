import java.util.Scanner;

public class  order{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nGood Day! PLease take your time ordering :)!\n");

        System.out.println("What would like to order first?");
        String firstOrder = scan.next();
        System.out.println("Please enter the exact of the item: ");
        Double firstOrderPrice = scan.nextDouble();

        System.out.println("What would like to order next?");
        String secondOrder = scan.next();
        System.out.println("Please enter the exact of the item: ");
        Double secondOrderPrice = scan.nextDouble();

        System.out.println("What would like to order last?");
        String thirdOrder = scan.next();
        System.out.println("Please enter the exact of the item: ");
        Double thirdOrderPrice = scan.nextDouble();

        Double totalPrice = firstOrderPrice + secondOrderPrice + thirdOrderPrice;

        System.out.println("\nI will repeat your order " + firstOrder + ", " + secondOrder + ", and " + thirdOrder + "\nYour total amount to pay is: " + totalPrice);

     


    }
}
