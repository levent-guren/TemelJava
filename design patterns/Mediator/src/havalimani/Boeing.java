package havalimani;

public class Boeing extends Ucak {

	public Boeing(String ucusNo) {
		super(ucusNo);
	}

	public void mesajAl(String gonderenUcakUcusNo, String kimeGonderiliyorUcusNo, String mesaj) {
		System.out.print(getUcusNo() + " ucus nolu Boeing'e ");
		System.out.print(gonderenUcakUcusNo + " nolu ucaktan ");
		if (kimeGonderiliyorUcusNo != null) {
			System.out.print("özel ");
		} else {
			System.out.print("herkese ");
		}
		System.out.println(mesaj + " mesaji geldi.");
	}
}
