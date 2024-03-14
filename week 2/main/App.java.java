package main;
import java.util.Scanner;

public class App
{

    public static void main( String[] args) {

        Hedgehog newHedgehog = new Hedgehog();
        Scanner sc = new Scanner(System.in);
       
        boolean exit = false;
        while(!exit){
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String sentence = sc.nextLine(); 
                        newHedgehog.speak(sentence);
                        break;
                        
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String ageString = sc.nextLine();
                        int age = Integer.parseInt(ageString);

                        newHedgehog = new Hedgehog(name, age);
                        break;

                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String amountString = sc.nextLine();
                        int amount = Integer.parseInt(amountString);
                        newHedgehog.run(amount);
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                    
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }
        }
    }
}