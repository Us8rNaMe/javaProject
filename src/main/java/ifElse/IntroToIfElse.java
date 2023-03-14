package ifElse;

public class IntroToIfElse {
    public static void main(String[] args) {

        int a= 10;
        int b =5;

        System.out.println("I will compare a and b below");

        if(a>b){
            System.out.println("a is more than b");
        }else{
            System.out.println("b is less than a");
        }
        System.out.println("I already compared a and b");

        String elon = "Tesla Space PaPal Twitter";
        if (elon.contains("PayPal")) {
            System.out.println("Elon owned PayPal");
        }else{
            System.out.println("Elon did not own PayPal");
        }


        a=100;
        b=200;
        if(a>b){
            System.out.println("a>b");
        }else{
            System.out.println("a<b");
        }

        if(b<a){
            System.out.println("b<a");
        }else{
            System.out.println("a>b");
        }

        String potato ="Potato the best";
        if (potato.endsWith("t")){
            System.out.println("YEEEEEEEEEEEEEEEEEEEEES");
        }else{
            System.out.println("NOOOOOOOOOOOOOOOOOOO");
        }

        String apple = "apple very tasty like candy";
        if (apple.contains("like")){
            System.out.println("mmmmmm yea u right");
        }else{
            System.out.println("no");
        }


        String cucumber ="its cucumber";
        if(cucumber.endsWith("cucumber")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }








    }
}
