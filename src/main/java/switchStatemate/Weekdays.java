package switchStatemate;

public class Weekdays {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
    }
}
