import java.util.ArrayList;

public class homework2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        int toplAM=0;
        for(Integer sayi:list){
            double kare=Math.pow(sayi,2);
            toplAM+=kare;
        }
        System.out.println(toplAM);
    }
}
