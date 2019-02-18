

public class Animal {
	void speak(String s) {
		System.out.println(s);
	}

	void move(int n) {
		System.out.println("Moving " + n + "steps ahead");
	}

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.speak("Bark");
		cat1.move(2);

	}

}
