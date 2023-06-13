package encapsulation;
import java.util.ArrayList;
public class User {
    private String username;
    private String password;





    private String dob;
    private String ssn;
    private int age;
    private long creditcardnumber;


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(long creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    private static ArrayList<String> users = new ArrayList<>();
    {
        users.add("bena");
        users.add("max");
        users.add("sunflower123");
        users.add("elturan");
        users.add("issa");
    }
    public void setUsername(String username) {
        if(username.length()>=3){
            if(!users.contains(username)){
                this.username = username;
            }else{
                System.out.println("User name is already in use");
                System.out.println("Please use another name");
            }
        }else {
            System.out.println("the length of username must be at least 3");
        }
    }
    public void setPassword(String setPassword){
        if(password.length()>=8){
            for(int i =0; i<password.length();i++){
            }
        }
    }
}