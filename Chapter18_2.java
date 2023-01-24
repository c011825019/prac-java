import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter18_2 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();

        map1.put(0, "ぶどう");
        map1.put(3, "もも");

        System.out.println("map(0): "+ map1.get(0));
        System.out.println("map(1): "+ map1.get(1));
        System.out.println("map(2): "+ map1.get(2));

        map1.put(0, "マスカット");

        System.out.println("map(0): "+ map1.get(0));

        System.out.println("map(0): "+map1.containsKey(0));
        System.out.println("ぶどう: " + map1.containsValue("ぶどう"));

        System.out.println("size: " + map1.size());

        map1.remove(0);
        System.out.println("map(0): "+ map1.get(0));

        map1.remove(3, "もも");
        System.out.println("もも: " + map1.containsValue("もも"));
    }
}