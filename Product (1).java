class Product {
    private int itemNumber;
    private String productName;
    private int unitsInStock;
    private double pricePerUnit;
    private boolean active;

    // Constructor
    public Product(int itemNumber, String productName, int unitsInStock, double pricePerUnit) {
        this.itemNumber = itemNumber;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.pricePerUnit = pricePerUnit;
        this.active = true; // Default value is true
    }

    // Getter and setter for active field
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Method to calculate inventory value
    public double getInventoryValue() {
        return pricePerUnit * unitsInStock;
    }

    // Override toString() method
    @Override
    public String toString() {
        String status = active ? "Active" : "Discontinued";
        return "Item Number: " + itemNumber + "\n" +
                "Name: " + productName + "\n" +
                "Quantity in stock: " + unitsInStock + "\n" +
                "Price: " + pricePerUnit + "\n" +
                "Stock Value: " + getInventoryValue() + "\n" +
                "Product Status: " + status;
    }
}
