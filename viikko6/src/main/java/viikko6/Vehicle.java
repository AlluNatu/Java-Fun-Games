package viikko6;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected Engine Engine;
    protected int maxSpeed;
    

    public Vehicle(String type, String manufacturer, String model, int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void printInfo(){
        System.out.println(type + ": " + manufacturer + " " + model);
        Engine.printSpecs();
        System.out.println("Huippunopeus: " + maxSpeed + "km/h\n");
    }
}
              