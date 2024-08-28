package SingleTon;

public class Dog {
	private static Dog singleton = new Dog();

	private Dog() {

	}

	static Dog getInstance() {
		return singleton;
	}
}
