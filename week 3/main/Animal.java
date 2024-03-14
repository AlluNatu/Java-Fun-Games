package main;

public class Animal {
    private String species;
    private String name;
    private int age;


    public Animal(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age =  age;
    }
    public void printAnimal() {
        System.out.println(species + ": " + name + ", " + age + " vuotta");
    }

    public String getname(Animal Animal){
        return Animal.name;
    }
    }

