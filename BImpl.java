public class BImpl implements B {
    public static void main(String[] args) {
        B b = new BImpl() {
          @Override
          public String hello() {
            return "Hello b!";
          }  
        };
        System.out.println(b.hello());
    }

    @Override
    public String hello() {
        return "Hello B!";
    }
}
