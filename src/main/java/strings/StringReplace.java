package strings;

public class StringReplace {
    public static void main(String[] args) {
        String word = "Apple banana strawberry";
        word = word.replace('a','e');

        System.out.println(word);

        System.out.println(word.replace('a', 'e'));


        String countries = "Italia Columbia Croatia";

        System.out.println(countries.replace(" ", "republick. "));

        //=======================================================


        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream, warm pasta, warm pizza";
        foods = foods.replace("hot","tasty");
        foods = foods.replace("cold","cool");
        foods = foods.replace("warm", "italian");
        System.out.println(foods);


        String letters =  "wqeqwe qweqe qkelwoqwe qweqw esdfehe yj tshss";
        letters = letters.replace('w','a');
        letters = letters.replace('q','a');
        letters = letters.replace('e','a');
        letters = letters.replace('s','a');
        letters = letters.replace('d','a');
        letters = letters.replace('y','a');
        letters = letters.replace('f','a');
        letters = letters.replace('h','a');
        letters = letters.replace('j','a');
        letters = letters.replace('t','a');
        letters = letters.replace('k','a');
        letters = letters.replace('l','a');
        letters = letters.replace('o','a');
        System.out.println(letters);



    }
}
