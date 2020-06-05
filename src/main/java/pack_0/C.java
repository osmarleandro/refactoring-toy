package pack_0;

public class C {
	A a1 = new A();
	A a2 = new A();

	private void c() {
		int counter = 0;
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0)
				counter++;
			else {
				counter--;
			}
		}
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0)
				counter++;
			else {
				counter--;
			}
		}
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0)
				counter++;
			else {
				counter--;
			}
		}
		for (int i = 0; i < 100; i++) {
			if (a1 != null && a1.isParameter() && a2 != null && a2.isParameter() && counter != 0 && counter % 2 == 0)
				counter = counter * 100;
		}
		
		int a = 1;
		int b = 2;
		int c = a*2 + b*3;
		if(c > 10) {
			a = b-c;
		}
		else {
			b = a -c;
		}
	}
}