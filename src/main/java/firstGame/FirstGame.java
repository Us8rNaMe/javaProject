package firstGame;

import java.util.Random;
import java.util.Scanner;

public class FirstGame {
    public static String[] word = {"apple", "potato", "orange", "elephant", "green", "slack", "brazil", "mouse", "codewise"};

    public static int round = 6;

    public static int score = 0;

    public static String selectRandomWord() {
        Random random = new Random();
        return word[random.nextInt(word.length)];
    }

    public static String shuffle(String shuffleWord){
        char[] letter = shuffleWord.toCharArray();
        Random rand = new Random();

        for (int i = letter.length - 1; i > 0; i--) {//Fisher-Yates
            int j = rand.nextInt(i + 1);
            char temp = letter[i];
            letter[i] = letter[j];
            letter[j] = temp;
        }
        return new String(letter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the World Jumble");

        for (int i=1;i<=round;i++){
            System.out.println("Round "+i);
            String shuffle = shuffle(selectRandomWord());
            System.out.println("Jumble Word is a "+shuffle);
            String inputWord = scanner.nextLine().toLowerCase();

            if(inputWord.equals(shuffle)){
                System.out.println("Correct");
                score++;
            }else {
                System.out.println("Wrong");
            }
        }System.out.println("Your score "+score);
    }
}




