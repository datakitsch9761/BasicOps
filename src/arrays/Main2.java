package arrays;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        //ArrayLists
        ArrayList animals = new ArrayList();
        animals.add(34);
        animals.add("Cow");
        animals.add("pig");
        animals.add("Cheetah");

//        animals.remove(0);
//        animals.add(0,"dog");
//        animals.remove("Cow");

        if(animals.contains("Parrot")){
            animals.remove("Parrot");
        }else{
            System.out.println("Nope");
        }

        animals.size();
        System.out.println(animals.size());

        System.out.println();

        for(int i=0;i < animals.size();i++){
            System.out.println("Animals: " + animals.get(i));
        }

        System.out.println();

        //clever for loop
        for(Object animal : animals){
            System.out.println(animal);
        }
    }
}
