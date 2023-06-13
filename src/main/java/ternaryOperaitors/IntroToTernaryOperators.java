package ternaryOperaitors;

public class IntroToTernaryOperators {
    public static void main(String[] args) {
        int num = 18;
        String evenOrOdd = num % 2 ==0?"even":"odd";
        System.out.println(evenOrOdd);

        int num1 = 8;
        int num2 = 100;
        int highest = num1>num2? num1 : num2;
        System.out.println(highest);


        String word = "hello";
        String assign = word.contains("a")? "yes" : "no";
        System.out.println(assign);

        boolean b = 10.9 < 11 & 11 > 0 ? true : false;
        System.out.println(b);

        int num3 = 34;
        System.out.println(checkIfNumberIsPositive(num3)? "positive": "negative");


        String result = checkIfNumberIsPositive(num3)
                ? returnNegative()
                : returnPositive();



    }

    public static boolean checkIfNumberIsPositive(int num){
        return num>0;
    }

    public static String returnNegative(){
        return "Negative";
    }

    public static String returnPositive(){
        return "Positive";
    }



}
