package tr.com.ornek;

public abstract class BaseServlet implements Servlet {
    @Override
    public void doGet() {
        System.out.println("Servlet çağırıldı. Loglama yapılıyor.");
        get();
    }
    public abstract void get();
}
