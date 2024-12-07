package tr.com.ornek;

public class Main {
    public static void main(String[] args) {
        try {
            deneme();
            System.out.println("6");
        } catch (Exception e) {
            System.out.println("Hata oluştu,"+e.getClass().getName());
        }
        System.out.println("bitti");
    }

    private static void deneme() {
        int a = 3/0;
        System.out.println("5");
    }
}