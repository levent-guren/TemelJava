package havalimani;

public class SavasanSahin extends Ucak {

	public SavasanSahin(String ucusNo) {
		super(ucusNo);
	}

	@Override
	public void mesajAl(String gonderenUcakUcusNo, String kimeGonderiliyorUcusNo, String mesaj) {
		System.out.print("Savasan Sahin(" + getUcusNo() + ") mesaj aldi: ");
		System.out.println("[" + gonderenUcakUcusNo + "]:" + mesaj);
	}

}
