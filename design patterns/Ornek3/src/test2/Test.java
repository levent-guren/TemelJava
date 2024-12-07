package test2;

public class Test {
	public static void main(String[] args) {
		System.out.println("String");
		String s1 = "Merhaba";
		String s2 = "Mer" + "haba";

		if (s1 == s2) {
			System.out.println("Esittir");
		} else {
			System.out.println("Esit degildir");
		}
		System.out.println("Integer");
		Integer i1 = Integer.parseInt("13");
		Integer i2 = Integer.parseInt(new String("13"));
		if (i1 == i2) {
			System.out.println("Esittir");
		} else {
			System.out.println("Esit degildir");

		}
	}
}
