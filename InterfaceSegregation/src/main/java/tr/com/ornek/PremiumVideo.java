package tr.com.ornek;

public class PremiumVideo implements  IVideo {
    private int time;
    @Override
    public void getTime() {

    }

    @Override
    public void playAdvert() {
        throw new RuntimeException("Premium videoda reklam yoktur.");
    }
}
