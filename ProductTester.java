import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;

        // Get input for p1
        System.out.println("Enter details for Product 1:");
        System.out.print("Item Number: ");
        tempNumber = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.print("Name: ");
        tempName = in.nextLine();
        System.out.print("Quantity in stock: ");
        tempQty = in.nextInt();
        System.out.print("Price per unit: ");
        tempPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Get input for p2
        System.out.println("\nEnter details for Product 2:");
        System.out.print("Item Number: ");
        tempNumber = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.print("Name: ");
        tempName = in.nextLine();
        System.out.print("Quantity in stock: ");
        tempQty = in.nextInt();
        System.out.print("Price per unit: ");
        tempPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);

        System.out.println("\nEnter details for Product 3:");
        System.out.print("Item Number: ");
        tempNumber = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.print("Name: ");
        tempName = in.nextLine();
        System.out.print("Quantity in stock: ");
        tempQty = in.nextInt();
        System.out.print("Price per unit: ");
        tempPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        Product p3 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Get input for p4
        System.out.println("\nEnter details for Product 4:");
        System.out.print("Item Number: ");
        tempNumber = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.print("Name: ");
        tempName = in.nextLine();
        System.out.print("Quantity in stock: ");
        tempQty = in.nextInt();
        System.out.print("Price per unit: ");
        tempPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        Product p4 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Get input for p5
        System.out.println("\nEnter details for Product 5:");
        System.out.print("Item Number: ");
        tempNumber = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.print("Name: ");
        tempName = in.nextLine();
        System.out.print("Quantity in stock: ");
        tempQty = in.nextInt();
        System.out.print("Price per unit: ");
        tempPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        Product p5 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Get input for p6
        System.out.println("\nEnter details for Product 6:");
        System.out.print("Item Number: ");
        tempNumber = in.nextInt();
        in.nextLine(); // Consume newline character
        System.out.print("Name: ");
        tempName = in.nextLine();
        System.out.print("Quantity in stock: ");
        tempQty = in.nextInt();
        System.out.print("Price per unit: ");
        tempPrice = in.nextDouble();
        in.nextLine(); // Consume newline character

        Product p6 = new Product(tempNumber, tempName, tempQty, tempPrice);

        // Set product p6 as discontinued
        p6.setActive(false);

        // Display details of each product
        System.out.println("\nProduct 1 Details:");
        System.out.println(p1);

        System.out.println("\nProduct 2 Details:");
        System.out.println(p2);

        System.out.println("\nProduct 3 Details:");
        System.out.println(p3);

        System.out.println("\nProduct 4 Details:");
        System.out.println(p4);

        System.out.println("\nProduct 5 Details:");
        System.out.println(p5);

        System.out.println("\nProduct 6 Details:");
        System.out.println(p6);  

        // Close Scanner object
        in.close();
    }
}