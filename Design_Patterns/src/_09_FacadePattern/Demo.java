package _09_FacadePattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderFacade facadeObj = new OrderFacade(new InventoryService(), new PaymentService(), new ShippingService(), new NotificationService());
		
		facadeObj.placeOrder("101", 2000.99);

	}

}
