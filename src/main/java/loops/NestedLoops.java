package loops;

public class NestedLoops {
    public static void main(String[] args) {
        int a;
        int b;

       // for (a = 1; a <= 15; a++) {
        //    for (b = 1; b <= 15; b++) {
         //       System.out.print((a * b) + "\t");
        //    }
          //  System.out.println();


            // for(int d=5;d>=8)
           for (a = 1; a <= 8; a++) {
                for (b = 1; b <= a; b++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
           }


        }
    }



