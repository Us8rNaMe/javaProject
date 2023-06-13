package Wrapper;

public class PractiseInteger {
    public static void main(String[] args) {
        String accountNumber = "12312312";
        int a = Integer.parseInt(accountNumber);
        Integer aa = Integer.parseInt(accountNumber);
        System.out.println(a);

        byte b = Byte.parseByte("120");
        System.out.println(b);

        double d = Double.max(12,23);
        System.out.println(d);

        boolean boo = Boolean.parseBoolean("TRUE");
        System.out.println(boo);

        char ch = Character.valueOf('6');
        System.out.println(ch);

        Integer num1 = Integer.valueOf(2);
        Integer num2 = Integer.valueOf("2");
        Integer num3 = Integer.valueOf('2');

        String balance = "432452";

        int number1 = 4;
        long number2 = number1; // implicit casting

        number1 = (int)number2; //explicit casting


        String intNumber = "19932";
        int numbeer = Integer.parseInt(intNumber);

        String doubleNumber = "49.99";
        double num = Double.parseDouble(doubleNumber);

        String strBool = "false";
        boolean bbb = Boolean.parseBoolean(strBool);

        String intWrap = "1343";
        Integer qwe = Integer.parseInt(intWrap);

        Integer intObj = Integer.valueOf("200");
        int prim = intObj;

        Boolean boolObj = Boolean.valueOf("true");
        String str = String.valueOf(boolObj);
        System.out.println(str);

        boolean primBool = boolObj;

        Double doublee = Double.valueOf("40.3");
        String doubleString = String.valueOf(doublee);
        System.out.println(doubleString);
    }
    public static int getIntFromString(String number){

        String onlyDigits = "";
        for(int i = 0;i<number.length();i++){
            if(Character.isDigit(number.charAt(i))){
                onlyDigits+= number.charAt(i);
            }
        }
        if(onlyDigits.isEmpty()){
            return -1;
        }
        return Integer.parseInt(onlyDigits);
    }

}