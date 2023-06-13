package homeworkDay18;

public class PracticeMethods {
    public static int qwe(int a, int b) {
        return a * b;
    }

    public String asd(String str) {
        return str.toLowerCase();
    }

    public double r(int a, int b) {
        return (double) a / b;
    }

    static boolean qwerty(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static double q(double a) {
        return a * 100;
    }

    static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return false;
            case 'q' , 'w' , 'r' , 't' , 'y' , 'p' , 's' , 'd' , 'f' , 'g' , 'h' , 'j' , 'k' , 'l' , 'z' , 'x' , 'c' , 'v' , 'b' , 'n' , 'm':
        }
        return true;
    }

    public boolean q(int a, int b) {
        int notSum = a - b;
        if (notSum >= (-5) && notSum <= (5)) {
            return true;
        }
        return false;
    }

    public boolean q(String str) {
        if (str.contains("@") && str.contains(".")) {
            return true;
        }
        return false;
    }

    public boolean q(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }return true;
    }
    static boolean e(int a,int b){
        if(a%2==0&&b%2==0||a%3==0&&b%3==0){
            return true;
        }return false;
    }
}


