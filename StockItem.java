public class StockItem {

    //item attributes
    private String description;
    private static int counter;
    private int id;
    private double price;
    private int quantity;

    //default constructor, calls overloaded constructor
    public StockItem() {
        this("unknown description", 0.00, 0);
    }

    //overloaded constructor, sets attributes
    public StockItem(String description, double price, int quantity) {
        this.id = counter;
        counter++;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    //id getter
    public int getId() {
        return id;
    }

    //description getter
    public String getDescription() {
        return description;
    }


    //price getter
    public double getPrice() {
        return price;
    }

    //price setter with conditional for negative price
    public void setPrice(double price) {
        if (price < 0) System.out.println("Price cannot be negative");
        else this.price = price;
    }

    //quantity getter
    public int getQuantity() {
        return quantity;
    }

    //raise quantity method
    public void raiseQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    //lower quantity method with conditional for negative inventory
    public void lowerQuantity(int quantity) {
        if (quantity < 0) System.out.println("Quantity cannot be negative");
        else this.quantity = quantity;
    }

    //toString override that returns item details for printing
    @Override
    public String toString() {
        String result = "Item number: " + id + " is " + description + " has price $" +
                String.format("%.2f", price) + " we currently have " + quantity + " in stock.";
        return result;
    }
}
