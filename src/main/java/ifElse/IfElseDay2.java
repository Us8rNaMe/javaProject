package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {
        byte time = -8;

        if (time >= 9 && time <= 17) {

            System.out.println("WORK HOURS");

        } else {
            if (time >= 7 && time <= 9 || time >= 18 && time <= 19) {
                System.out.println("Commute hourse");

            } else {
                if (time >= 6 && time <= 8) {
                    System.out.println("BREAKFAST TIME");

                } else {
                    if (time >= 12 && time <= 13) {
                        System.out.println("LANCH TIME");

                    } else {
                        if (time >= 20 && time <= 22) {
                            System.out.println("DINNER TIME");

                        } else {
                            if (time >= 22 && time <= 24) {
                                System.out.println("late hours");

                            } else {
                                if (time >= 0 && time <= 6) {
                                    System.out.println("SLEEP TIME");

                                } else {
                                    System.out.println("INVALID TIME");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
