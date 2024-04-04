package A3;

public class Program
{
    public static void main(String[] args)
    {
    	IFlyable flyable = null;
		ISwimmable swimmable = new SwimFast();
		Animal misty = new Horse("Misty", flyable, swimmable);
		misty.MakeSound();
		misty.Eat();
		misty.Swim();

		System.out.println();
m
        swimmable = null;
        Animal henry = new Hawk("Henry", flyable, swimmable);
		henry.MakeSound();
		henry.Eat();
		henry.Fly();
		
		
    }
}
