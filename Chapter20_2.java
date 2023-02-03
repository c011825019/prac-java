import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter20_2 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

        System.out.println(animals);

        Collections.sort(
            animals,
            new Comparator<String>() {
                @Override
                public int compare(String x, String y) {
                    return x.compareTo(y);
                }
            }
        );

        System.out.println(animals);
    }
}
