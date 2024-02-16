public class Car {
    private String brand;
    private String model;
    private String plate;
    private int engineSize;

    public Car(String brand, String model, String plate, int engineSize) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.engineSize = engineSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public int setEngineSize() {
        return engineSize;
    }

    public String toString() {
        return "This car is a " + brand + ", model: " + model + ", its plate: " + plate + ", its Engine Size: " +  engineSize + ".";
    }
}