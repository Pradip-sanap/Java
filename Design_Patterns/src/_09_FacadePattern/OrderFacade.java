package _09_FacadePattern;

public class OrderFacade {
 
    private InventoryService inventoryService;
 
    private PaymentService paymentService;
 
    private ShippingService shippingService;
 
    private NotificationService notificationService;
    

    public OrderFacade(InventoryService inventoryService, 
			    		PaymentService paymentService,
						ShippingService shippingService, 
						NotificationService notificationService) 
    {
		super();
		this.inventoryService = inventoryService;
		this.paymentService = paymentService;
		this.shippingService = shippingService;
		this.notificationService = notificationService;
	}


	public void placeOrder(String productId, double amount) {

        inventoryService.checkStock(productId);

        paymentService.processPayment(amount);

        shippingService.shipProduct(productId);

        notificationService.sendNotification("Order placed successfully");
    }
}
