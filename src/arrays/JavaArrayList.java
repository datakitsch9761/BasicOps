package arrays;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        //ArrayLists(Little bit more sophisticated and flexible
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");

        animals.remove(0);
        animals.remove("Cat");

        if(animals.contains("dog")){
            animals.remove("Dog");
        }else{
            animals.add("Chicken");
        }



        for(int i = 0 ; i < animals.size(); i++){
            System.out.println("Animals : " + animals.get(i));
        }

        System.out.println();

        for(String animal : animals){
            System.out.println("Animals :" + animal);
        }

        System.out.println();

        if(animals.isEmpty()){
            System.out.println("Animal is empty");
        }else{
            for(String animal : animals){
                System.out.println("Animals are : " + animal);
            }
        }

        System.out.println();

        System.out.println(animals.size());
    }
}