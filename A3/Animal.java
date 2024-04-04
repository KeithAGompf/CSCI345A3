package A3;
/*
# Name:Keith Gompf
# Date:11/28/23
# Description: Animal class that is able to add on a new animal with new features by adding a class 
 */

 abstract class Animal {
	protected String name;
	private IFlyable flyable;
	private ISwimmable swimmable;
	
	void Eat() {
	}
	
	 void Fly() {
		if(flyable != null) {
			System.out.print(name + " is ");
			flyable.Fly();
		}else {// case if null fly
			System.out.println(name + " does not fly...");
		}
	}
	void MakeSound() {
	}
	
	void Swim() {
		if(swimmable != null) {
			System.out.print(name + " is ");
			swimmable.Swim();
		}else {//case if null swim
			System.out.println(name + " does not swim...");
		}
	}
	//constructor
	protected Animal(String name, IFlyable flyable, ISwimmable swimmable) {
		this.name = name; //represents the Animal's Name
		this.flyable = flyable;
		this.swimmable = swimmable;
	}
	
}
