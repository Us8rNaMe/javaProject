package methods;

public class IntroToMethods {

   String getCapitalOfFrance(){
       return "Paris";


   }
   double getPI(){
       return 3.14;
   }
   int getZero(){
       return 0;
   }
   char getLetter(){
       return 'a';
   }
   double getAreaInRectable(double length,double width){
       return length * width;

   }
   double getParimeterOfTriangle(double a,double c, double b){
       return a+b+c;
   }
  public static int stringAsParametr(String str){

       return str.length();
   }

    public static void main(String[] args) {
       IntroToMethods intro = new IntroToMethods();
       System.out.println(intro.getAreaInRectable(3.4,6.4));

       int length = stringAsParametr("Barcelona");
       System.out.println(length);
    }

}
