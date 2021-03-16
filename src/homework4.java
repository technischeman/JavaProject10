import java.util.HashMap;
import java.util.Map;

public class homework4 {
    public static void main(String[] args) {
        HashMap<Integer,String>myMap=new HashMap<>();
        HashMap<String,Integer>myMap2=new HashMap<>();
        myMap.put(1,"ptesi");//entry dir
        myMap.put(2,"sali");
        myMap.put(3,"carsamba");
        myMap.put(4,"persembe");
        System.out.println(myMap);
        myMap2.put("dört",1);
        boolean biriceriyormu=myMap.containsKey(1);
        boolean sifiriceriyormu=myMap.containsKey(0);
        System.out.println(biriceriyormu);
        System.out.println(sifiriceriyormu);
        boolean ptesiicerirmi= myMap.containsValue("ptesi");
        boolean pazaricerirmi= myMap.containsValue("pazar");
        System.out.println(pazaricerirmi);
        System.out.println(ptesiicerirmi);
        myMap.remove(1);
        myMap.remove(3,"carsamba");
        System.out.println(myMap);
        myMap.replace(2,"büyük sali");
        System.out.println(myMap);
        myMap.replace(2,"ikinci persembe");
        System.out.println(myMap);
        myMap.replace(2,"sali","cuma");
        System.out.println(myMap);
        for (Integer key:myMap.keySet()){
            System.out.println(key);

        }
        for (String VALUE:myMap.values()){
            System.out.println(VALUE);

        }for (Map.Entry entrydeger:myMap.entrySet()){
            System.out.println(entrydeger);


        }



    }
}
