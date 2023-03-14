package homeworkDay8;

public class IfElseHomework {
    public static void main(String[] args) {
        int number =40;
        if(number>0){
            System.out.println("pozitive");
        } else if (number<0) {
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }


        int year = 2019;
        if(year % 4 == 0 || year % 100 != 0 && year % 400 == 0){
            System.out.println("year is a leap year");
        }else{
            System.out.println("year is not a loap");
        }


        int num1 = 3;
        int num2 = 123;
        if(num1>num2){
            System.out.println(num1);
        } else{
            System.out.println(num2);
        }


        double tempInFahrenheit = 77.3;
        if(tempInFahrenheit<32){
            System.out.println("is below freezing");
        } else if (tempInFahrenheit>212) {
            System.out.println("above boiling");
        }else {
            System.out.println("in between");
        }


        byte mounth = 6;
        if(mounth==12||mounth==2||mounth==1){
            System.out.println("Winter");
        }else {
            if (mounth == 3 || mounth == 4 || mounth == 5) {
                System.out.println("Spring");
            } else {
                if (mounth == 6 || mounth == 7 || mounth == 8) {
                    System.out.println("Summer");
                } else {
                    if (mounth == 9 || mounth == 10 || mounth == 11) {
                        System.out.println("Fall");
                    } else {
                        System.out.println("Wrong number");
                    }
                }
            }
        }
    }
}
