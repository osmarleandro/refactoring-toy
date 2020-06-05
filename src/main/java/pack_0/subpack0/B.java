package pack_0.subpack0;

public class B {
	A a1 = new A();
	A a2 = new A();

	public boolean abc() {
		int a = 1;
		int b = 2;
		int c = a*2 + b*3;
		if(c > 10) {
			a = b-c;
		}
		else {
			b = a -c;
		}

		if(c > 10) {
			a = b-c;
		}
		else {
			b = a -c;
		}
		
		if (a1 != null && a1.isParameter() && a2.isParameter()) {
			return a1.isParameter();
		}
		
		if(c > 10) {
			a = b-c;
		}
		else {
			b = a -c;
		}
		return a2.isParameter();
	}
}