package constructors;

public class AgainAndAgain {

    int length;
    int width;
        public AgainAndAgain (){
            int length = 1 ;
            int width = 1;
        }
        public AgainAndAgain(int length,int width){
            this.length = length;
            this.width = width;
        }
        public AgainAndAgain(int a){
            length = a;
            width = a;
        }

        public int area(){

            return length*width;
        }

    public static void main(String[] args) {
        AgainAndAgain rectangle1 = new AgainAndAgain();
        AgainAndAgain rectangle2 = new AgainAndAgain(5,3);
        AgainAndAgain rectangle3 = new AgainAndAgain(6);

        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());
    }
}
