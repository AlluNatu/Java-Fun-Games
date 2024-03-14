package viikko6;

public class Ship extends Vehicle {

    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Laiva", manufacturer, model, maxSpeed);
        Engine = new Engine("Wärtsilä super", 1000);
    }

    public void sail(){
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }
}