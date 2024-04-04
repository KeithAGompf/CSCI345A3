package A3;

public class Horse extends Animal {
	//Horse's unique eating
	void Eat() {
		System.out.println(name + " is eating like a horse...");
	}
	//constructor
	public Horse(String name, IFlyable flyable, ISwimmable swimmable) {
		super(name,flyable,swimmable);
	}
	//horse unique sound
	 void MakeSound() {
		System.out.println(name + " says neigh!");
	}
}
