package polymorph;

public class Animal {
    private String name;

    //Method overloading ->
    public void makeSound(){
        System.out.println("GRRRRRRRRR");
    }

    public void makeSound(String soundType) {
        System.out.println(soundType);
    }

    public void makeSound(String soundType, String loudness) {
        System.out.println(soundType + ", loudness " + loudness );
    }

}
