package futbol;

public class Oyuncu implements Observable {
	private String adi;

	public Oyuncu(String adi) {
		this.adi = adi;
	}

	@Override
	public void topYerDegistirdi(Top top) {
		System.out.println(adi + " adli futbolcu topun yer degistirdigini anladi. x:" + top.getX()
				+ ", y:" + top.getY());
	}

}
