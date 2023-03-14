package switchStatemate;

public class Vovels {
    public static void main(String[] args) {
        char vowels = 'A';
        switch (vowels){
            case 'A','E','I','O','U':
                System.out.println("Vowel");
                break;
            case 'B','D','C':
                System.out.println("diferent");
                break;

        }
    }
}
