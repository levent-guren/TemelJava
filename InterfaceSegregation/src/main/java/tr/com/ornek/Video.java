package tr.com.ornek;

public class Video implements  IVideo {
    private int time;
    @Override
    public void getTime() {

    }

    @Override
    public void playAdvert() {
        System.out.println("Play advertisement.");
    }
}
