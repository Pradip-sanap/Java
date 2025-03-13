package DesignPattern.Builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
 
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
                ", GraphicsCard=" + (isGraphicsCardEnabled ? "Enabled" : "Disabled") +
                ", Bluetooth=" + (isBluetoothEnabled ? "Enabled" : "Disabled") + "]";
    }

    // Builder Class (ConcreteBuilder)
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Optional parameters
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder enableGraphicsCard(boolean enable) {
            this.isGraphicsCardEnabled = enable;
            return this;
        }

        public ComputerBuilder enableBluetooth(boolean enable) {
            this.isBluetoothEnabled = enable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
