import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class homework5 {
    public static void main(String[] args) {
        HashMap<String ,String>neumap=new HashMap<>();
        neumap.put("tr","Turkish");
        neumap.put("en","English");
        neumap.put("de","German");
        neumap.put("ar","Arabic");
        System.out.println(neumap);
        for (Map.Entry isimler:neumap.entrySet()){
            System.out.println(isimler);

        }
        boolean tr=neumap.containsKey("tr");
        boolean es=neumap.containsKey("es");
        System.out.println(tr);
        System.out.println(es);
        System.out.println(neumap.get("en"));







    }
}
