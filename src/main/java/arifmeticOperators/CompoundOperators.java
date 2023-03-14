package arifmeticOperators;

public class CompoundOperators {
    public static void main(String[] args) {
        int a =5;
        a++;//a=a+1
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        int age=18;
        System.out.println(age);
        age++;
        System.out.println(age++);//19
        System.out.println(age);//20

        int price = 20;
        System.out.println(++price); //21
        System.out.println(price++);//21
        System.out.println(price);//22


        int money = 20;
        money+= 3;//money = money+3
        System.out.println(money);//23

        money-= 3;//money = money -3
        System.out.println(money);//20

        money *= 2;//money = money*2
        System.out.println(money);//40

        money /=4;//money = money/4
        System.out.println(money);//10

        money %=10;//money = money %10
        System.out.println(money);//0


        int b = (8 +2345/3) % 5 *5;
        System.out.println(b);
        int b2 = 8;
        b2 += 2345;
        b2 %= 3;
        b2 *= 5;
        System.out.println(b2);

    }
}
