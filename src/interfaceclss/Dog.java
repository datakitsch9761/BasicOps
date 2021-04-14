package interfaceclss;

public class Dog extends Canine implements Pet{

    @Override
    public void beFriendly() {
        System.out.println("Friendly Dog");
    }

    @Override
    public void play() {
        System.out.println("Playful Dog");
    }
}
