package test;

import beans.AhsapEvBuilder;
import beans.BetonEvBuilder;
import beans.Muteahhit;

public class Test {
	public static void main(String[] args) {
		Muteahhit muteahhit = new Muteahhit();
		muteahhit.setBuilder(new AhsapEvBuilder());
		System.out.println(muteahhit.insaEt(true, false));

		muteahhit.setBuilder(new BetonEvBuilder());
		System.out.println(muteahhit.insaEt(true, true));
	}
}
