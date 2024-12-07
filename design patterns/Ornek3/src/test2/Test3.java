package test2;

import java.io.File;
import java.io.FileFilter;

public class Test3 {
	public static class Test4 implements FileFilter {

		@Override
		public boolean accept(File pathname) {
			return false;
		}

	}

	public class Test5 extends Test4 {

	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		test4.accept(null);
	}
}
