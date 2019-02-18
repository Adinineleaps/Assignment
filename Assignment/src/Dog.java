
public class Dog extends Animal {

	@Override
	void speak(String s) {
				System.out.println(s);
	}

	@Override
	void move(int n) {
		System.out.println("Moving" + n +"Steps");
	}

}


