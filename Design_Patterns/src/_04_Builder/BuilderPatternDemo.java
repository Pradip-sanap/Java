package _04_Builder;

// Product Class
class Mobile {
    // Required Parameters
    private String processor;
    private int ram;

    // Optional Parameters
    private int storage;
    private double screenSize;
    private int battery;

    // Private constructor to force object creation through Builder
    private Mobile(MobileBuilder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.screenSize = builder.screenSize;
        this.battery = builder.battery;
    }

    @Override
    public String toString() {
        return "Mobile [Processor=" + processor + ", RAM=" + ram + "GB, Storage=" + storage + "GB, Screen Size="
                + screenSize + " inches, Battery=" + battery + "mAh]";
    }

    // Static Builder Class inside Mobile
    public static class MobileBuilder {
        // Required Parameters
        private String processor;
        private int ram;

        // Optional Parameters
        private int storage;
        private double screenSize;
        private int battery;

        // Constructor with required fields
        public MobileBuilder(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }

        // Setter methods for optional fields (returning builder for method chaining)
        public MobileBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

//        public MobileBuilder setScreenSize(double screenSize) {
//            this.screenSize = screenSize;
//            return this;
//        }

        public MobileBuilder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        // Build method to return final Mobile object
        public Mobile build() {
        	System.out.println("---------------");
        	System.out.println(this);
            return new Mobile(this);
        }
    }
}

// Main class
public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Creating a Mobile object using Builder
        Mobile mobile1 = new Mobile.MobileBuilder("Snapdragon 888", 8)
                .setStorage(128)
//                .setScreenSize(6.5)
                .setBattery(5000)
                .build();

        System.out.println(mobile1);

        // Creating another Mobile object with different configurations
        Mobile mobile2 = new Mobile.MobileBuilder("Apple A16 Bionic", 6)
                .setStorage(256)
//                .setScreenSize(6.1)
                .build();

        System.out.println(mobile2);
    }
}
