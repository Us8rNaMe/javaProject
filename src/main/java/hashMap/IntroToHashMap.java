package hashMap;

import java.util.HashMap;

public class IntroToHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitalsCity = new HashMap<>();

        capitalsCity.put("Ukraine","Kuiv");
        capitalsCity.put("Poland","Warshaw");
        capitalsCity.put("Germany","Berlin");
        capitalsCity.put("Italy","Rome");

        System.out.println(capitalsCity);

        String city = capitalsCity.get("Germany");
        System.out.println(city);

        capitalsCity.remove("Italy");
        System.out.println(capitalsCity);

        capitalsCity.clear();
        System.out.println(capitalsCity);


        System.out.println(capitalsCity.keySet());


    }
}
