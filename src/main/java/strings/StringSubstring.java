package strings;

public class StringSubstring {
    public static void main(String[] args) {
        String message = "Hello Chicago, why are you cold and windy?";

        String city = message.substring(6,13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA, our population is 140 million people,"+
                "the average salary is 90k dollars,and our president is Joe Biden";


        String country = welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf(","));
        System.out.println(country);
        String popylation = welcomeSign.substring(welcomeSign.indexOf("1"),welcomeSign.indexOf(" people"));
        System.out.println(popylation);
        String salary = welcomeSign.substring(welcomeSign.indexOf("9"),welcomeSign.indexOf(",and"));
        System.out.println(salary);
        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);




        String phrase = "Just one positive thought in the morning can change your whole day.";

        System.out.println(phrase.substring(0, 4)+ " a "+ phrase.substring(18,25));
        System.out.println(phrase.substring(9,16)+" "+phrase.substring(33,40));
        System.out.println(phrase.substring(57,62)+" "+phrase.substring(33,40));
        System.out.println(phrase.substring(46,51)+" "+phrase.substring(5,7)+" "+phrase.substring(63,66));
        System.out.println(phrase.substring(45,51)+" "+phrase.substring(53,56)+" "+phrase.substring(18,25));

        //===========================================================

        String str1 = "hi";
        String str2 = "bye";

        System.out.println(str1+" "+str2+" "+str1.toUpperCase()+" "+str1.toUpperCase()+" "+str2.toUpperCase()+" "+str2.toUpperCase()+" "+str2+" "+str1);




        System.out.println(str2.substring(0,1)+str1.substring(1));

        String see ="see";
        String hear ="hear";

        System.out.println(hear.replace("h","s"));
        System.out.println(see.substring(0,1)+hear.substring(1,4));
        System.out.println(see.charAt(0)+hear.substring(1));







    }

}
