package loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int a=1;
        do {
            a++;
            if(a%3==0){
                System.out.println(a);
            }
        }while (a<=100);

    }
}
