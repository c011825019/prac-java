public class Chapter17 {
    public static void main(String[] args) {
        Dessert apple = Dessert.APPLE;
        Dessert ice = Dessert.ICE_CREAM;
        Dessert cake = Dessert.CAKE;

        System.out.println(apple);
        System.out.println(ice);
        System.out.println(cake);
    }

    public enum Dessert {
        APPLE, ICE_CREAM, CAKE
    }
}