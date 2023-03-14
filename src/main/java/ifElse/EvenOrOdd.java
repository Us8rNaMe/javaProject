package ifElse;

public class EvenOrOdd {
    public static void main(String[] args)
    {

        int number =9;
        if(number%2==0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }

        int digit =40;
        if(digit >0){
            System.out.println("positive");
        }else{ if(digit <0)
            System.out.println("negative");
        else{
              System.out.println("zero");
        }
        }

        int a1 =10;
        int a2 =20;
        if(a1>a2){
            System.out.println("a1 Greater than a2");
        }else {
            if (a1 < a2) {
                System.out.println("a1 Less than a2");
            } else {
                System.out.println("a1 Equal to a2");
            }
        }
}
}
