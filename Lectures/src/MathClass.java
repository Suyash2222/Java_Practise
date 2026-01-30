public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-15));
        System.out.println(Math.ceil(5.4));
        System.out.println(Math.floor(5.4));
        System.out.println(Math.round(5.64));

        int random = (int) Math.round( Math.random() * 100);
        for (int i = 0; i < 10; i++) {
            System.out.println(random);
        }
    }
}
