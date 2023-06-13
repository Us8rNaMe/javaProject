package encapsulation;

public class Application {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.name = "Mike";

        client1.set_address("rolling meadows");
        System.out.println(client1.get_address());

        client1.setCredit_card_number("12313212312312");
        System.out.println(client1.getCredit_card_number());
    }



}
