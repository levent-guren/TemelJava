package tr.com.ornek;

public enum Gezegen {
    MERKUR(23), VENUS(45), DUNYA(50);
    private int cap;
    private Gezegen(int cap) {
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    @Override
    public String toString() {
        return "Gezegen{" +
                "cap=" + cap +
                '}';
    }
}
