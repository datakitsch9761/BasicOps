package polymorph;

public class Dog extends Animal{

    private String name;

    public void move(){
        System.out.println("Move!");
    }

    //Override make sound function from our parent class
    public void makeSound(){
        System.out.println("FUCK!!!!");
    }

    public void makeSound(String soundType){
        System.out.println(soundType);
    }
}
