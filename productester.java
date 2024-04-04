public class productester {
    public static void main(String[] args) {
        // Create and initialize six Product objects
        Product product1 = new Product(); // Default constructor
        Product product2 = new Product(); // Default constructor
        Product product3 = new Product(1, "Greatest Hits", 25, 9.99); // Overloaded constructor
        Product product4 = new Product(2, "Software XYZ", 50, 49.99); // Overloaded constructor
        Product product5 = new Product(3, "Office Supplies Pack", 100, 19.99); // Overloaded constructor
        Product product6 = new Product(4, "DVD Movie: Action Packed", 20, 14.99); // Overloaded constructor

        // Display the details of each product
        System.out.println("Product 1 Details:");
        System.out.println(product1);
        System.out.println();

        System.out.println("Product 2 Details:");
        System.out.println(product2);
        System.out.println();

        System.out.println("Product 3 Details:");
        System.out.println(product3);
        System.out.println();

        System.out.println("Product 4 Details:");
        System.out.println(product4);
        System.out.println();

        System.out.println("Product 5 Details:");
        System.out.println(product5);
        System.out.println();

        System.out.println("Product 6 Details:");
        System.out.println(product6);
    }
}
