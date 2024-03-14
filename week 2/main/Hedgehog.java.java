package main;

public class Hedgehog{
    private String name;
    private int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak(String sentence) {
        if(sentence.length()>0){
            System.out.println(name+ ": " + sentence);                       
        } else {
            System.out.println("Olen "+ name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        }
        }
    
    public void run(int amount) {
        if (amount <= 0){
            return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
        run(amount - 1);
    }
    
}
