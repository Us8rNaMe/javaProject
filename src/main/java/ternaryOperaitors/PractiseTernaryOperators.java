package ternaryOperaitors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PractiseTernaryOperators {
   /*

    use TERNARY OPERATORS
1. compare two doubles and assign the lowest one to new double
2. compare two String lengths, and print the longest string
3. check if String contains any vowel, and print "vowel", else "no vowel"
4. check if arraylist has more than 3 elements, and print "enough", else "not enough"
5. check if hashmap contains key "banana", and assign "banana" to
    String fruit, else assign "apple" to fruit
6. if hashmap contains value "stone", assign true to boolean hasStone, else false
7. check if arraylist has the same number of elements as array, print "same",
   else "not same"
8. if given int is prime, assign it to int primeDigit, else assign 0;
9. if average of arraylist<Integer> elements is more than 10, print "wohoo",
   else print "nooo"
10. compare 3 bytes and assign the highest one to int biggestByte

 */

    public static void main(String[] args) {
        //1. compare two doubles and assign the lowest one to new double
        double d1 = 1.2;
        double d2 = 1.3;
        double lowest = d1<d2? d1 : d2;
        System.out.println(lowest);

        //2. compare two String lengths, and print the longest string
        String s1 = "Potato";
        String s2 = "Broccoli";
        String longest = s1.length()>s2.length()? s1:s2;
        System.out.println(longest);

        //3. check if String contains any vowel, and print "vowel", else "no vowel"
        String str = "I love potato";
        String vovels = str.contains("a")||str.contains("i")||str.contains("o")||str.contains("e")||str.contains("u")||str.contains("A")||str.contains("I")||str.contains("O")||str.contains("E")||str.contains("U")? "vovels":"not vovels";
        System.out.println(vovels);

        //4. check if arraylist has more than 3 elements, and print "enough", else "not enough"
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("cabbage");
        vegetables.add("pepper");
        vegetables.add("onion");
        vegetables.add("lettuce");

        System.out.println(vegetables.size()>3 ?"enough": "not enough");

        //5. check if hashmap contains key "banana", and assign "banana" to String fruit, else assign "apple" to fruit

        HashMap<String,String> yesBylba = new HashMap<>();
        yesBylba.put("banana","like");
        yesBylba.put("salsa","karavan");

        String fruit = yesBylba.containsKey("banana")? "banana" : "apple";
        System.out.println(fruit);

        //6. if hashmap contains value "stone", assign true to boolean hasStone, else false

        HashMap<String,String> notBylba = new HashMap<>();
        notBylba.put("banana","like");
        notBylba.put("salsa","karavan");

        System.out.println(yesBylba.containsValue("stone")? true : false);

        //7. check if arraylist has the same number of elements as array, print "same",else "not same"

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);
        number.add(11);
        Integer [] nymber = {1,2,3,4,5,6};

        System.out.println(nymber.length==number.size()? "Same":"not same");

        //8. if given int is prime, assign it to int primeDigit, else assign 0;

            System.out.println(Math.sqrt(55));
            int num = 55;
            int isPrime = isPrime(num)? num : 0;
            System.out.println(isPrime);


        //9. if average of arraylist<Integer> elements is more than 10, print "wohoo",else print "nooo"

        //10. compare 3 bytes and assign the highest one to int biggestByte

        byte b1 = 1;
        byte b2 = 7;
        byte b3 = 4;
        byte biggestByte = (b1 > b2) ? ((b1 > b3) ? b1 : b3) : ((b2 > b3) ? b2 : b3);
        System.out.println(biggestByte);




}






    public static boolean isPrime(int a){
        if(a <=1){
            return false;
        }

        for(int i =2; i<Math.sqrt(a);i++){
            if (a % i == 0) {
                return false;
            }
        }return true;
    }



}
