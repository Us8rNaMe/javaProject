package homeworkDay24;

public class MultidimensionalArraysHW {
    public static void main(String[] args) {

        String[] oneDArray = {"apple", "banana", "orange"};
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.println(oneDArray[i]);
        }


        String[][] twoDArray = {{"apple", "banana"}, {"orange", "grape"}};
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }


        String[][][] threeDArray = {{{"apple", "banana"}, {"orange", "grape"}}, {{"watermelon", "kiwi"}, {"pineapple", "mango"}}};
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        String[][][][] fourDArray = {{{{"apple", "banana"}, {"orange", "grape"}}, {{"pear", "kiwi"}, {"pineapple", "mango"}}}, {{{"cherry", "plum"}, {"lemon", "lime"}}, {{"apricot", "peach"}, {"watermelon", "potato"}}}};
        for (int i = 0; i < fourDArray.length; i++) {
            for (int j = 0; j < fourDArray[i].length; j++) {
                for (int k = 0; k < fourDArray[i][j].length; k++) {
                    for (int l = 0; l < fourDArray[i][j][k].length; l++) {
                        System.out.print(fourDArray[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


        String[][][][][] fiveDArray = {{{{{"apple", "banana"}, {"orange", "grape"}}, {{"pear", "kiwi"}, {"pineapple", "mango"}}}, {{{"cherry", "plum"}, {"lemon", "lime"}}, {{"apricot", "peach"}, {"watermelon", "potato"}}}}, {{{{"strawberry", "raspberry"}, {"blueberry", "blackberry"}}, {{"kiwi", "mango"}, {"guava", "papaya"}}}, {{{"peanut", "cashew"}, {"almond", "walnut"}}, {{"hazelnut", "pecan"}, {"macadamia", "pistachio"}}}}};
        for (int i = 0; i < fiveDArray.length; i++) {
            for (int j = 0; j < fiveDArray[i].length; j++) {
                for (int k = 0; k < fiveDArray[i][j].length; k++) {
                    for (int l = 0; l < fiveDArray[i][j][k].length; l++) {
                        for (int p = 0; p < fiveDArray[i][j][k][l].length; p++) {
                            System.out.println(fiveDArray[i][j][k][l][p] + " ");
                        }
                    }
                }
            }
        }
    }
}
