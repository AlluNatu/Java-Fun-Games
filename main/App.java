package main;
import java.util.Scanner;

public class App
{

    public static void main( String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi:");
        String zooname = sc.nextLine();
        Zoo Zoo = new Zoo(zooname);
       
        boolean exit = false;
        while(!exit){
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        String ageString = sc.nextLine();
                        int age = Integer.parseInt(ageString);

                        Animal newAnimal = new Animal(species, name, age);
                        Zoo.addAnimal(newAnimal);
                        break;
                        
                    case 2:
                        Zoo.listAnimals();
                        break;

                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String amountString = sc.nextLine();
                        int amount = Integer.parseInt(amountString);
                        Zoo.runAnimals(amount);
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        sc.close();
                        exit = true;
                        break;
                    
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }
        }
    }
}