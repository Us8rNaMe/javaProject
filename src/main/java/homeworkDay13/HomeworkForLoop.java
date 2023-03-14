package homeworkDay13;

public class HomeworkForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }

        for (int n = 2; n <= 20; n++) {
            if (n % 2 == 0)
                System.out.println(n);
        }

        for(int q=10;q>=1;q--){
        System.out.println(q);
        }

        for(int r=1;r<=10;r++){
            System.out.println(r+"*5"+"="+r*5);
        }

        for(int y=1;y<20;y++){
            if(y%3==0)
                System.out.println(y);
        }

        int sum=0;
        for(int w=1;w<=50;w++){
            int e=w*2;
            sum+=e;
        }System.out.println(sum);


        int num = 1234;
        int sum1 = 0;
        for (int i = num; i > 0; i = i / 10) {
            int digit = i % 10;
            sum1 += digit;
        }
        System.out.println( num +" "+ sum1);


        for( int a = 5; a > 0; a--){
            for( int b = 0; b < a; b++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int r = 1; r <= 4; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.print(r);
            }
            System.out.println();
        }
    }
}



