package hashMap;

import java.util.HashMap;

public class PracticeHashMap {
    /*
    Create a HashMap to store the names of different fruits and
    their corresponding prices.

    Create a method which takes hashmap, and String fruitname
    and returns the price of given fruit
     */

    public static void main(String[] args) {
        HashMap<String, Double> fruitNames = new HashMap<>();
        fruitNames.put("kiwi", 2.99);
        fruitNames.put("banana", 1.59);
        fruitNames.put("mango", 4.99);
        fruitNames.put("pineapple", 6.49);
        fruitNames.put("apple", 4.39);

        System.out.println(fruitNames.get("banana"));
        getPriceOfFruit(fruitNames, "apple");
        getPriceOfFruit(fruitNames, "pineapple");

//        ======================================= CREATE HASHMAP WITH STOCK NAMES AND PRICES <String, Double>

        HashMap<String, Double> stocks = new HashMap<>();
        stocks.put("apple", 400.3);
        stocks.put("tesla", 3241.4);
        stocks.put("alphabet", 2342.12);
        stocks.put("meta", 231.45);
        stocks.put("chase", 32.1);
        stocks.put("gamestop", -4253.2);
        stocks.put("disney", 0.0);

        findTheHighestStockPrice(stocks);
        findTheLowestStockPrice(stocks);
        getSecondHighestStockPrice(stocks);
        System.out.println(removeStocksBelowLimit(stocks, 100));

        stocks.remove("meta");
        stocks.get("meta");

    }

    public static double getPriceOfFruit(HashMap<String, Double> fruits, String fruitName){
        System.out.println(fruits.get(fruitName));
        return fruits.get(fruitName);
    }

    /*
    apple, 400.90
    tesla, 1200.32
    meta, 300.43
    bofa, 5.5
    slack, 123.54
    macdonalds, 98.12
     */

    public static double findTheHighestStockPrice(HashMap<String, Double> stocks){
        double highest = Double.MIN_VALUE; //-2 bil
        String highestStockName = "";

        for (String stockName : stocks.keySet()) {
            if (stocks.get(stockName) > highest){
                highest = stocks.get(stockName);
                highestStockName = stockName;
            }
        }

        System.out.println("The highest stock is " + highestStockName + " with value of: " + highest);
        return highest;
    }

    public static double findTheLowestStockPrice(HashMap<String, Double> stocks){
        double lowest = Integer.MAX_VALUE;
        String lowestStockName ="";
        for (String stockName : stocks.keySet()){
            if (stocks.get(stockName)< lowest){
                lowest = stocks.get(stockName);
                lowestStockName = stockName;
            }
        }
        System.out.println("The lowest stock is: " + lowestStockName + " with value of: "+ lowest);
        return lowest;
    }

    public static double getSecondHighestStockPrice(HashMap<String, Double> stocks){
        double largest = findTheHighestStockPrice(stocks);
        double secondLagest = Integer.MIN_VALUE;

        for (Double stockPrice : stocks.values()) {
            if (stockPrice > secondLagest && stockPrice != largest) {
                secondLagest = stockPrice;
            }
        }
        System.out.println("The second largest stock is: " + secondLagest);
        return secondLagest;
    }


    /*
    create a method which will accept HashMap <String, Double> stocks, Double limit
    and remove all stocks with prices below or equal to the limit
    and return new HashMap

    apple, 400.90
    tesla, 1200.32
    meta, 300.43
    slack, 123.54

    100
     */
    public static HashMap<String, Double> removeStocksBelowLimit(HashMap<String, Double> stocks, double limit){
        //write a code which removes all stock
//        stocks.remove()
        HashMap<String, Double> newStocks = new HashMap<>();

        for(String temp : stocks.keySet()){
            if(stocks.get(temp) > limit){
                newStocks.put(temp, stocks.get(temp));
            }
        }

        return newStocks;
    }




}