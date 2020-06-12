package pack_0.subpack0;

import pack_0.subpack0.subsubpack_0.A;

public class B {
	A a1 = new A();
	A a2 = new A();

	public boolean b() {
		int a = 1;
		int b = 2;
		int c = a * 2 + b * 3;
		if (c > 10) {
			a = b - c;
		} else {
			b = a - c;
		}

		if (c > 10) {
			a = b - c;
		} else {
			b = a - c;
		}

		if (a1 != null && a1.isParameter() && a2.isParameter()) {
			return a1.isParameter();
		}

		c(a, b, c);
		return a2.isParameter();
	}

	private void c(int a, int b, int c) {
		if (c > 10) {
			a = b - c;
		} else {
			b = a - c;
		}
	}
}