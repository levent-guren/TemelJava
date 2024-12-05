package tr.com.ornek;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        requestGeldi("/rapor");
        requestGeldi("/personelListe");
    }

    public static void requestGeldi(String request) {
        Servlet servlet = getServlet(request);
        servlet.doGet();
    }
    private static Servlet getServlet(String request) {
        if ("/rapor".equals(request)) {
            return new RaporServlet();
        }
        if ("/personelListe".equals(request)) {
            return new PersonelListeServlet();
        }
        return null;
    }
}