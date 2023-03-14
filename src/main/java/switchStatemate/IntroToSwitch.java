package switchStatemate;

public class IntroToSwitch {
    public static void main(String[] args) {

        int num = 3;
        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
//=================================================================
        String num2 = "five";
        switch (num2){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
        String num1 = "five";
        if (num1.equalsIgnoreCase("one") ){
            System.out.println(1);
        } else if (num1.equalsIgnoreCase("Two")) {
            System.out.println(2);
        } else if (num1.equalsIgnoreCase(" Three")){
            System.out.println(3);
        } else if (num1.equalsIgnoreCase("Four")) {
            System.out.println(4);
        } else if (num1.equalsIgnoreCase("Five")) {
            System.out.println(5);
        } else {
            System.out.println(" Invalid Day.");
        }
    }
}