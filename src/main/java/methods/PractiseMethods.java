package methods;

public class PractiseMethods {
    public boolean aBoolean(int a){
        if (a%2==0){
            return true;
        }return false;
    }
//=================================================================
    public boolean bBoolean(int a) {
        if (a % 10 == 0) {
            return true;
        }
        return false;
    }
    //=================================================================
    public static int getLargest(int a, int b){
        if(a>b){
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return b;
    }
//=========================================================================
    public static void myltiplicationTable(int a){
        for(int i=1;i<11;i++){
            System.out.println (a+"*"+i+"="+a*i);

        }
    }
//=========================================================================
    public static int fourInt(int a,int b,int c,int d){
        return ((a+b+c+d)/4);
    }
    //===============================================================================
    public static int potato(int a) {
        int sum =0;
        for (int i = 1; i <= a; i++) {
           sum+=i;
        }return sum;
    }




    public static void main(String[] args) {
        myltiplicationTable(8);
    System.out.println(potato(5));

    }

}
