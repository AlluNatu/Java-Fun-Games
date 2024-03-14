package viikko6;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle newVehicle = null;
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        String typeString = sc.nextLine();
                        int type = Integer.parseInt(typeString);
                        System.out.println("Anna kulkuneuvon valmistaja:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna kulkuneuvon malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna kulkuneuvon huippunopeus:");
                        String Speedstring = sc.nextLine();
                        int Speed = Integer.parseInt(Speedstring);

                        if (type == 1) {
                            newVehicle = new Car(manufacturer, model, Speed);
                        }

                        if(type == 2) {
                            newVehicle = new Plane(manufacturer, model, Speed);

                        } else if (type == 3){
                            newVehicle = new Ship(manufacturer, model, Speed);
                        }
                        vehicles.add(newVehicle);
                        break;

                    case 2:
                        for (Vehicle vehicle : vehicles) {
                            vehicle.printInfo();
                        }
                        break;
                    case 3:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Car){
                                Car car = (Car) vehicle;
                                car.drive();
                            }
                        }
                        break;
                    case 4:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Plane){
                            Plane plane = (Plane) vehicle;
                            plane.fly();
                        }
                    }
                        break;
                    case 5:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Ship){
                            Ship ship = (Ship) vehicle;
                            ship.sail();
                        }
                    }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        } 
        sc.close();
    }
}