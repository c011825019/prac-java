public class Chapter20_1 {
    public static void main(String[] args) {
        Chapter20_1 a = new Chapter20_1();
        System.out.println(a.hello());

        Chapter20_1 b = new Chapter20_1() {
            @Override
            public String hello() {
                return "Hello b!";
            }
        };

        System.out.println(b.hello());
    }

    public String hello() {
        return "Hello A!";
    }
}
