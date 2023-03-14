package loops;

public class PractiseLoops {
    public static void main(String[] args) {
        int a=1;
        for(a=10; a>=1; a--){
            System.out.println("The value of x is: "+a);
        }
        //===============================================
        for(a=10; a>=0; a=a-2){
            System.out.println("The value of x is: "+a);
        }
        //===============================================
        for(a=1; a<=15; a+=2){
            System.out.println("The value of x is: "+a);
        }
        //===============================================
        int s=0;
        for(a=1; a<=10; a++) {
            System.out.println("The value of x is: " + a);
            s=s+a;
        }
        System.out.println("The sum of first 10 numbers is: "+s);

        //===============================================
        s=0;
        for(a=0; a<=100; a+=2) {
            System.out.println("The value of x is: " + a);
            s=s+a;
        }
        System.out.println("The sum of first 10 numbers is: "+s);

        //===============================================

    }
}
