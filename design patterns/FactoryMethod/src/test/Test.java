package test;

import java.util.Arrays;

import yemek.Kisir;
import yemek.Menemen;
import yemek.Yemek;

public class Test {
	public static void main(String[] args) {
		Yemek[] yemekler = { new Kisir(), new Menemen() };
		Arrays.stream(yemekler).forEach(System.out::println);
	}
}
