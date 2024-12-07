package tone;

import java.util.HashMap;
import java.util.Map;

public class ToneGenerator {
	private Map<Character, ITone> tonlar = new HashMap<>();

	public void cevir(String numara) {
		for (int i = 0; i < numara.length(); i++) {
			getTone(numara.charAt(i)).cevir();
		}
	}

	public ITone getTone(char number) {
		ITone tone = tonlar.get(number);
		if (tone == null) {
			System.out.println(String.valueOf(number) + " icin generator sinifi uretiliyor.");
			tone = toneUret(number);
			tonlar.put(number, tone);
		}
		return tone;
	}

	private ITone toneUret(char number) {
		switch (number) {
		case '0': {
			return new Tone0();
		}
		case '1': {
			return new Tone1();
		}
		case '2': {
			return new Tone2();
		}
		case '3': {
			return new Tone3();
		}
		case '4': {
			return new Tone4();
		}
		case '5': {
			return new Tone5();
		}
		case '6': {
			return new Tone6();
		}
		case '7': {
			return new Tone7();
		}
		case '8': {
			return new Tone8();
		}
		case '9': {
			return new Tone9();
		}
		}
		return null;
	}
}
