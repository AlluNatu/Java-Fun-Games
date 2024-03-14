package main;
import java.util.ArrayList;

public class Zoo {
    private String zooname;
    private ArrayList<Animal> animals = new ArrayList<>();


    public Zoo(String zooname){
        this.zooname = zooname;
        
    }

    public void addAnimal(Animal newAnimal){
        animals.add(newAnimal);
    }

    public void listAnimals(){
        System.out.println(zooname + " pitää sisällään seuraavat eläimet:");
        for (Animal newAnimal : animals) {
            newAnimal.printAnimal();
        }
    }

    public void runAnimals(int amount){
        for (Animal newAnimal : animals) {
            if (amount <= 0){
                return;
            }
            for (int i = 0; i < amount; i++){
            System.out.println(newAnimal.getname(newAnimal) + " juoksee kovaa vauhtia!");
        }
        }
    }
}
