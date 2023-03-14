package strings;

public class IntoToStrings {
    public static void main(String [] args){

        String firstName = " John ";
        String lastName = " Doe";
        System.out.println(firstName); // John
        System.out.println(lastName);  // Doe

        firstName = "Michael";
        lastName = "Antony";
        System.out.println(firstName); // Michael
        System.out.println(lastName); // Antony

        firstName = "Max";
        lastName = "Dzundza";
        System.out.println(firstName);
        System.out.println(lastName);

        firstName = "Potato";
        lastName = "123";
        System.out.println(firstName);
        System.out.println(lastName);



        String myName = "Maxim";
        String myMidleName = "Igorovich";
        String myLastName = "Dzyndza";
        String age = "17";
        String address = "secret";
        String mobile = "7738050273";
        String friendName = "Savchyk";
        String city = "Chicago";
        System.out.println(myName);
        System.out.println(myMidleName);
        System.out.println(myLastName);
        System.out.println(age);
        System.out.println(address);
        System.out.println(mobile);
        System.out.println(friendName);
        System.out.println(city);


        String myPotato = "MyPotato";
        String myPotato2 = "Mypotato2";
        System.out.println(myPotato +" "+ myPotato2);

        System.out.println("My name is" + " " + myName);
        System.out.println("I am" +" "+ age +" "+ "years old");


        String a1 = "AAAAAAAAAAAAAAAAAAA";
        System.out.println("If i scared i said"+" "+a1);


        String town ="London213123@@@#!@#!$@";
        System.out.println(town);

        String city2 =  new String("New York");
        System.out.println(city2);

        //=====================================================================


        System.out.println(town.length());
        System.out.println(city2.length());//8

        String name ="Anatananarivo";
        System.out.println("The length of Anatananarivo is:"+" "+name.length());

        System.out.println("Benazir".length());
        System.out.println("Madrid");

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";

        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame);

        isSame = fruit1.equals(fruit3);
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";

        System.out.println("Is banana same as orange?"+" "+fruit1.equals(fruit2));

        boolean isSame2 = !fruit1.equals(fruit2);
        System.out.println(isSame2);

        int cucumber = 5;
        int tomato = 10;

        System.out.println("cucumber:"+ cucumber);
        System.out.println("tomato"+tomato);


       int aa =5;
       int bb = 10;


       aa += bb;
       bb -= bb;

       System.out.println(aa);
       System.out.println(bb);


       String state1 ="California";
       String state2 ="Illinois";
       String state3 ="Florida";
       String state4 ="illinois";
       String state5 ="florida";

       boolean isNotSame1 =! state1.equals(state2);
       boolean isNotSame2 =! state2.equals(state4);
       boolean isSame1 = state3.equals(state5);
       boolean isSame3 = state5.equals(state1);
       boolean isNotSame =! state4.equals(state3);

       System.out.println(isNotSame1);
       System.out.println(isNotSame2);
       System.out.println(isSame1);
       System.out.println(isSame3);
       System.out.println(isNotSame);





    }

}
