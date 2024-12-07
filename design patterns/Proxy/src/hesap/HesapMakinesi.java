package hesap;

public class HesapMakinesi implements IHesapMakinesi {
	public double hesapla(double sayi1, double sayi2, char islem) {
		System.out.println(sayi1 + String.valueOf(islem) + sayi2 + " hesaplaniyor.");
		switch (islem) {
			case '+': {
				return sayi1 + sayi2;
			}
			case '-': {
				return sayi1 - sayi2;
			}
			case '*': {
				return sayi1 * sayi2;
			}
			case '/': {
				return sayi1 / sayi2;
			}
		}
		return 0.0;
	}
}
