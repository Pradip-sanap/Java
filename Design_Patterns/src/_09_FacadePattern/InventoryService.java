package _09_FacadePattern;

public class InventoryService {

    public void checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
    }
}
