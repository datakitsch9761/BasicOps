package staticproject;

public class StaticProject {
    private static String name;

    public static void main(String[] args) {

        int myValue = -45;
        int secondValue = 56;
        int x = Math.min(myValue,secondValue);
        int y = Math.abs(myValue);


        StaticProject myProject = new StaticProject();

        //Math class is utility class
        System.out.println("X min : " + x + " y Abs : " + y);
        //System.out.println("Minimum : " + Math.min(myValue,secondValue));
        //System.out.println(Math.abs(myValue));
    }
    public static void setName(String n){
        name = n;
    }
}
