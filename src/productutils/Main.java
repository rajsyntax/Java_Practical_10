package productutils;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product(201, "Laptop", "Electronics", 75000);
        Product p2 = new Product(202, "Smartphone", "Electronics", 45000);
        Product p3 = new Product(203, "Headphones", "Accessories", 5000);
        Product p4 = new Product(204, "Office Chair", "Furniture", 12000);
        Product p5 = new Product(205, "Backpack", "Fashion", 3000);
        Product p6 = new Product(206, "Smartwatch", "Electronics", 18000);
        Product p7 = new Product(201, "Laptop", "Electronics", 75000);

        Product[] products = {p1, p2, p3, p4, p5, p6};

        System.out.println("=== Testing toString() ===");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== Testing equals() ===");
        System.out.println("p1.equals(p7): " + p1.equals(p7));
        System.out.println("p1.equals(p2): " + p1.equals(p2));

        System.out.println("\n=== Testing hashCode() ===");
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p7.hashCode(): " + p7.hashCode());

        System.out.println("\n=== Utility Methods ===");

        double totalPrice =
                ProductUtils.calculateTotalPrice(products);

        System.out.println("Total Inventory Value: " + totalPrice);

        Product mostExpensive =
                ProductUtils.findMostExpensiveProduct(products);

        System.out.println("Most Expensive Product: " + mostExpensive);
    }
}