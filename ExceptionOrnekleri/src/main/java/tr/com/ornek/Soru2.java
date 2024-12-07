package tr.com.ornek;

public class Soru2 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            deneme(2);
            System.out.println("4");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(10);
    }
    private static void deneme(int x) {
        try {
            int a = 3 / 0;
            System.out.println(x);
            System.out.println(8);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(9);
            throw new RuntimeException("6");
        }
        System.out.println(7);
    }
}
