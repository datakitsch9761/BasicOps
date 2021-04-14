package interfaceclss;

public class InterfaceTest {
    public static void main(String[] args) {
        Dog mydog = new Dog();

        mydog.setName("Pyro");

        System.out.println(mydog.getName());
        mydog.beFriendly();
        mydog.play();
    }
    // Animal => Canine => Dog (Inherent in this way)

}
