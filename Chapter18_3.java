import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter18_3 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();

        set1.add("スイカ");
        set1.add("メロン");

        System.out.println("スイカ: " + set1.contains("スイカ"));
        System.out.println("なし: " + set1.contains("なし"));

        System.out.println("size: " + set1.size());

        set1.remove("スイカ");

        System.out.println("スイカ: " + set1.contains("スイカ"));

        set1.add("スイカ");
        set1.add("なし");

        for (String set : set1) {
            System.out.println(set);
        }
    }
}
