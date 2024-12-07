package yorumlayici;

import java.util.ArrayList;
import java.util.List;

public class IsaretYorumlayici implements Yorumlayici {
	private List<String> isaretler = new ArrayList<>();

	public List<String> getIsaretler() {
		return isaretler;
	}

	public boolean isaretKaldiMi() {
		return isaretler.size() > 0;
	}

	@Override
	public void yorumla(String ifade) {
		String[] parcalar = ifade.split(" ");
		for (String parca : parcalar) {
			if (parca.equals("+") || parca.equals("-") || parca.equals("*") || parca.equals("/")) {
				isaretler.add(parca);
			}
		}
	}

	public String getSonIsaret() {
		String sonIsaret = isaretler.get(isaretler.size() - 1);
		isaretler.remove(isaretler.size() - 1);
		return sonIsaret;
	}

}
