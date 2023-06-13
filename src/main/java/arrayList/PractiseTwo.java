package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PractiseTwo {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("watermelon");
        shoppingList.add("potato");
        shoppingList.add("cherry");

        System.out.println("Shopping list");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + 1 + ") " + shoppingList.get(i));
        }
        System.out.println("In shopping list, there are " + shoppingList.size() + " items");

        shoppingList.clear();
        System.out.println(shoppingList.size());

        String[] newItems = {"cucumber", "onion", "kiwi", "potato", "tomato"};
        ArrayList<String> newShoppingList = new ArrayList<>(Arrays.asList(newItems));

        System.out.println("New shopping list ");
        int i = 0;
        while (i < newShoppingList.size()) {
            System.out.println(i + 1 + ") " + newShoppingList.get(i));
            i++;
        }

    }
}

