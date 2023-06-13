package encapsulation;

import javax.print.DocFlavor;

public class Client {

    String name;
    String phone_number;

    private String credit_card_number;
    private String address;



    public void set_address(String address){
        if (address.contains("USA")) {
            this.address = address;
        }
    }
    public String get_address(){
        return address;
    }

    public void setCredit_card_number(String credit_card_number){
        this.credit_card_number = credit_card_number;
    }
    public String getCredit_card_number(){
        return credit_card_number;
    }










}
