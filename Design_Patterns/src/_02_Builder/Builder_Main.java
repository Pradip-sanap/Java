package _02_Builder;

public class Builder_Main {

	 public static void main(String[] args) {
	        // Create a computer using the builder
	        Computer gamingPC = new Computer.ComputerBuilder("Intel i9", "32GB")
	            .setStorage("1TB SSD")
	            .enableGraphicsCard(true)
	            .enableBluetooth(true)
	            .build();

	        Computer officePC = new Computer.ComputerBuilder("Intel i5", "16GB")
	            .setStorage("500GB HDD")
	            .build();

	        // Display the created computers
	        System.out.println(gamingPC);
	        System.out.println(officePC);
	    }

}
