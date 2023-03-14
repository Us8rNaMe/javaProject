package objects;

public class FacebookUser {

        String username;

        String password;

        String firstName;

        String lastName;

    public void login (String username, String password) {
        System.out.println(username+ " logged in to the applicantion");
    }

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser();
        user.login("abc", "abc123");

        user.username = "tokyo";
        user.password = "abc";
        user.firstName = "potato";
        user.lastName = "tomato";

        FacebookUser user2 = new FacebookUser();
        user2.login("japan","qwe");

        user2.username = "japan";
        user2.password = "qwe";
        user2.firstName = "cucumber";
        user2.lastName = "tomato";


        String str = "asasdasd";
        System.out.println(str.length());


    }

    }
