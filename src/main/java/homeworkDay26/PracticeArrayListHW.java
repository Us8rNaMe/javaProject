package homeworkDay26;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeArrayListHW {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Ford");
        car.add("KIA");
        car.add("Corvette");
        car.add("Nissan");


        car.remove(0);
        car.remove(2);

        car.add("Potato");
        car.add("Mercedes");
        car.add("rt5yryreyrey");

        System.out.println("The number of cars is: " + car.size());
        int i = 0;
        while (i < car.size()) {
            System.out.println(car.get(i));
            i++;
        }
        Iterator<String> iterator = car.iterator();
        while (iterator.hasNext()) {
            String cars = iterator.next();
            if (cars.length() < 7) {
                iterator.remove();
            }
        }

        System.out.println("The number of cars is: " + car.size());

        int q = 0;
        do {
            System.out.println(car.get(q));
            q++;
        } while (q < car.size());



        ArrayList<Integer> years = new ArrayList<>();
        years.add(2000);
        years.add(2005);
        years.add(1985);
        years.add(1242);
        years.add(490);

        years.remove(0);
        years.remove(years.size() - 1);

        years.add(1945);
        years.add(1933);
        years.add(1915);
        years.add(1916);
        years.add(1917);

        System.out.println("The number of years is: " + years.size());

        for (int p = 0; p < years.size(); p++) {
            System.out.println(years.get(p));
        }

        Iterator<Integer> Iterator1 = years.iterator();
        while (iterator.hasNext()) {
            Integer year = Iterator1.next();
            if (isPrime(year)) {
                iterator.remove();
            }
        }
        System.out.println(years);

        Iterator<Integer> iterator2 = years.iterator();
        do {
            System.out.println(iterator2.next());
        } while (iterator.hasNext());



    }

    public static boolean isPrime ( int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


