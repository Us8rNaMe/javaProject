package arrarys;

public class PractiseArrays {
    public static void main(String[] args) {

        String[] cities={"Barcelona","Milan","Capetown","Tokyo","Sydney"};
        System.out.println(cities.length);

        System.out.println(cities[1]);


        String countries[] ={"Columbia","Turkey","South Korea","Switzerland","Australia"};

        System.out.println("all the best fruits come from "+countries[0]);
        System.out.println(countries[1]+"'s capital is Ankara");
        System.out.println(countries[2]+" is not the same as North "+countries[2].substring(6,11));
        System.out.println(countries+" has the best skiing resorts");
        System.out.println(countries[4]+" "+
                countries[4].substring(2)+" "+
                countries[4].substring(4)+" "+
                countries[4].substring(6)+" "+
                countries[4].substring(8));

        int[] aray={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i = 0; i<aray.length-1;i++){
            System.out.print(aray[i]+" ");
        }
    }
}
