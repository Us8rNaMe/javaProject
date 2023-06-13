package forEach;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class GuessTheWord {

    public static String[] animals = {"elephant", "giraffe", "lion", "cheetah", "dog", "cat", "hippo"};
    public static String[] cities = {"Milan", "New York", "Bishkek", "Minsk", "Santo Domingo", "Kishinev"};
    public static String[] vegetables = {"potato", "tomato", "onion", "carrot", "cucumber"};
    public static List<Character> usersLeters = new ArrayList<>();

    public static void main(String[] args) {
        int easy = 6;
        int medium = 3;
        int difficult = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game. Please choose the topic:");
        System.out.println("Choose a topic:");
        System.out.println("1. Animals");
        System.out.println("2. Cities");
        System.out.println("3. Vegetables");
        int topic= scanner.nextInt();
        String[] word;
        switch (topic) {
            case 1:
                word = animals;
                break;
            case 2:
                word = cities;
                break;
            case 3:
                word = vegetables;
                break;
            default:
                System.out.println("Invalid choice. Using vegetables words.");
                word = vegetables;
                break;
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Choose level");
        System.out.println("Easy, Medium or Difficult");
        String level = scanner1.next().toLowerCase();

        int lives = 0;
        if (level.equals("easy")) {
            lives = 6;
            System.out.println("You have " + easy + " lives");
        } else if (level.equals("medium")) {
            lives = 3;
            System.out.println("You have " + medium + " lives");
        } else if (level.equals("difficult")) {
            lives = 1;
            System.out.println("You have " + difficult + " lives");
        } else
            System.out.println("Wrong input");

        Random random = new Random();
        String word1 = word[random.nextInt(word.length)];

        System.out.println("The word has " +word1.length()+ " letters.");
        System.out.println("The first letter is " +word1.charAt(0));
        char[] word2 = new char[word1.length()];
        Arrays.fill(word2, '_');
        System.out.println(word2);

        while (lives > 0) {
            System.out.println("Guess a letter:");
            char guess = scanner.next().charAt(0);
            if (usersLeters.contains(guess)) {
                System.out.println("You already guessed that letter.");
                continue;
            }
            usersLeters.add(guess);

            boolean correctGuess = false;
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) == guess) {
                    word2[i] = guess;
                    correctGuess = true;
                }
            }
            if (correctGuess) {
                System.out.println("Correct letter!");
                System.out.println(word2);
                if (!Arrays.toString(word2).contains("_")) {
                    System.out.println("Congratulations, you won!");
                    return;
                }
            } else {
                lives--;
                System.out.println("Incorrect letter.");
                System.out.println("You have "+lives+" lives left.");
            }
        }
    }
}