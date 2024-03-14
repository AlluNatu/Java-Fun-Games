package viikko6;

public class Plane extends Vehicle {

    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Lentokone", manufacturer, model, maxSpeed);
        Engine = new Engine("Suihkumoottori", 500);
    }

    public void fly(){
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}


