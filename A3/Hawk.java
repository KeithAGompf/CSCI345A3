package A3;

public class Hawk extends Animal{
	//Hawk's unique eating
	 void Eat() {
		 System.out.println(name + " is eating like a hawk...");
		
	}
	 //constructor
	 public Hawk(String name, IFlyable flyable, ISwimmable swimmable) {
		super(name,flyable,swimmable);
		
	}
	 //Hawk's unique sound
	 void MakeSound() {
		System.out.println(name + " says awwwkkk!");
	}
}
