public class Chapter21_1 {
    public static void main(String[] args) {
        Greeting greeting = (String word) -> {
            System.out.println(word);
            return word;
        };

        System.out.print(greeting.hello("a"));
    }

    @FunctionalInterface
    public interface Greeting {
        public String hello(String word);
    }
}