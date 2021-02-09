import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        //create scanner object for user choice later in program
        Scanner scan = new Scanner(System.in);

        //create milk inventory object
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60, 15);

        //create bread inventory object
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98, 30);

        //initialize choice variable
        int choice;

        //initialize double for use if user changes price
        double newPrice;

        //initialize int for use if user changes inventory
        int newInvn;

        //print menu in do while loop to continue showing until user quits
        do {
            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change price of Milk");
            System.out.println("4. Change price of Bread");
            System.out.println("5. Add Milk to Inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            choice = Integer.parseInt(scan.nextLine());

            //switch statement to act on user input
            switch (choice) {
                case 1:
                    milk.lowerQuantity(milk.getQuantity() - 1);
                    break;
                case 2:
                    bread.lowerQuantity(bread.getQuantity() - 1);
                    break;
                case 3:
                    System.out.println("What is the new price of milk?");
                    newPrice = Double.parseDouble(scan.nextLine());
                    milk.setPrice(newPrice);
                    break;
                case 4:
                    System.out.println("What is the new price of bread?");
                    newPrice = Double.parseDouble(scan.nextLine());
                    bread.setPrice(newPrice);
                    break;
                case 5:
                    System.out.println("How many gallons of milk did we get?");
                    newInvn = Integer.parseInt(scan.nextLine());
                    milk.raiseQuantity(newInvn);
                    break;
                case 6:
                    System.out.println("How many loaves of bread did we get?");
                    newInvn = Integer.parseInt(scan.nextLine());
                    bread.raiseQuantity(newInvn);
                    break;
                case 7:
                    System.out.println(milk);
                    System.out.println(bread);
            }

            //conditional
        } while (choice != 8);

    }
}
