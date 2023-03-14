package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        //for(int a=0;a<=10;a++){

          //  if(a!=5){
          //      System.out.println(a);
    //        }
    //    }

     //   for(int b=1;b<=100;b++){
       //     if(b%3==0){
       //         continue;

      //      }System.out.println(b);
     //   }


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter one negative number");
        int q=scanner.nextInt();
        System.out.println("enter one posative number");
        int w=scanner.nextInt();

        for(int i = q; i <= w; i++) {
            if (i % 2 == 0 && i < 0)
                continue;

            if (i % 2 != 0 && i > 0)
                continue;

            System.out.println(i);
        }
    }
}
