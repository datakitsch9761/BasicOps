package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapsProject {
    public static void main(String[] args) {

        HashMap user = new HashMap<>();

        HashMap<String, Integer> newuser = new HashMap<>();
        newuser.put("Sue", 34);
        System.out.println(newuser.get("Sue"));

        user.put("Kealy", 34);
        user.put("Bonnie",25);

        if(user.containsKey("Life")){
            System.out.println("yay");
        }else{
            System.out.println("Nay");
        }

        Iterator it = user.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = "+ pair.getValue());
        }


//        System.out.println("Values : " + user.values());
//        System.out.println("Entire Values : " + user.entrySet());


//        System.out.println(user.get("Kealy"));
//        System.out.println(user.get("Bonnie"));
    }
}
