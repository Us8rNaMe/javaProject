package homeworkDay9;

public class HomeworkIfElse {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Two of the numbers are equal");
        } else {
            System.out.println("None of the numbers are equal");

        }


        int num = 9;
        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("Multiple of 3 or 5");
        } else {
            System.out.println("Not a multiple of 3 or 5");
        }


        int n1 = 3;
        int n2 = 6;
        int s = n1 + n2;
        if (s % 2 == 0) {
            System.out.println("Even");
        } else if (s % 3 == 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Wrong number");
        }


        int p = 0;
        if (num % num == 0 && num % 1 == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
