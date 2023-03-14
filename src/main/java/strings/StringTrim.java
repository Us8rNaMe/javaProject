package strings;

public class StringTrim {
    public static void main(String[] args) {
        String batch ="    Batch 2 is cool    ";
        System.out.println(batch);

        batch = batch.trim();
        System.out.println(batch);


        System.out.println(batch.contains("cool"));
        System.out.println(batch.contains("lazy"));
        System.out.println(batch.contains("2"));
        System.out.println(batch.contains(" "));


    }
}
