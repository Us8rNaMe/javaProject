package ifElse;

public class                    AndOperator {
    public static void main(String[] args) {

        if(2<3 && 5<10){
            System.out.println("bye bye");
        }

        if(false && true){
            System.out.println("potato");
        }

        if (true && false){
            System.out.println("do something");
        }

        String username = "";
        String password = "";
        String email = "";

        String enteredusername ="";
        String enteredpassword ="";
        String enteredemail = "";

       if (enteredusername.equals(username) && enteredpassword.equals(password)){
           System.out.println("Logged in");
           if (!enteredemail.equals(email)){
               System.out.println("Recover email");
           }
       }
       if (enteredusername.equals(username) && !enteredpassword.equals(password)){
           System.out.println("incorect password, try again");
       }
       if (!enteredusername.equals(username)){
           System.out.println("user name is incorect");
       }
       if (!enteredusername.equals(username)&& enteredemail.equals(email) && enteredpassword.equals(password)){
           System.out.println("recover name");
       }
       if (enteredusername.equals(username) && enteredemail.equals(email) && !enteredpassword.equals(password)){
           System.out.println("wrong password");
       }
       if (enteredusername.equals(username) && !enteredemail.equals(email) && enteredpassword.equals(password)){
           System.out.println("wrong email");
       }





    }
}
