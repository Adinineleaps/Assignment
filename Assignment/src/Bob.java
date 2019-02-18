
public class Bob extends Animal {
	@Override
	void speak(String s) {
		System.out.println(s);
	}

	@Override
	void move(int n) {
		System.out.println("Moviing"+n+"Steps");
	}
}
