package disk;

public class Dosya extends Yapi {

	public Dosya(String adi, long boyut) {
		super(adi, boyut);
	}

	@Override
	public String toString() {
		return getAdi() + " " + getBoyut() + " bytes";
	}

}
