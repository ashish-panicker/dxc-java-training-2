package javademos.inheritance;

public abstract class Vehicle {

    protected String brand;
    protected String fuelType;
    protected String vehicleType;

    public Vehicle() {
        System.out.println("vehicle zero argument constructor");
        this.brand = "";
        this.fuelType = "";
        this.vehicleType = "";
    }

    public Vehicle(String brand, String fuelType, String vehicleType) {
        System.out.println("vehicle three argument constructor");
        this.brand = brand;
        this.fuelType = fuelType;
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract void fuelEffciency();

}
