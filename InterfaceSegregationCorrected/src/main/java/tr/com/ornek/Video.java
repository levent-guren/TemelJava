package tr.com.ornek;

public class Video implements  IVideo, IAdsVideo {
    private int time;
    @Override
    public void getTime() {

    }

    @Override
    public void playAds() {
        System.out.println("Play advertisement.");
    }
}
