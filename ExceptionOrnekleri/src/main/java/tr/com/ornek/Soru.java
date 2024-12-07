package tr.com.ornek;

public class Soru {
    public static void main(String[] args) {
        System.out.println("2");
        try {
            deneme(3);
            System.out.println("4");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(10);
    }
    private static void deneme(int x) {
        try {
            System.out.println(x);
            int a = 3 / 0;
            System.out.println(8);
        } catch (Exception e) {
            System.out.println(9);
            throw new RuntimeException("6");
        }
        System.out.println(7);
    }
}
