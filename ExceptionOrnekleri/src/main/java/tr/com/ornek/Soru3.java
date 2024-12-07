package tr.com.ornek;

public class Soru3 {
    public static void main(String[] args) {
        try {
            try {
                deneme(2);
                System.out.println("5");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            System.out.println(3);
            throw new RuntimeException(e);
        }
        System.out.println(10);
    }
    private static void deneme(int x) {
        try {
            int a = 3 / 0;
            System.out.println(x);
        } catch (RuntimeException  e) {
            System.out.println(4);
            throw e;
        }
        System.out.println(7);
    }
}
