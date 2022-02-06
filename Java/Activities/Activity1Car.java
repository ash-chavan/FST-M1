package Activities;
public class Activity1Car {

	String color;
	String Transmission;
	int doors;
	int tyres;
	int make;
	
	Activity1Car()
	{
		tyres = 4;
		make = 4;
		
		
	}
	
	public void displayCharacteristics()
	{
		System.out.println("Color of car :"+color);
		System.out.println("transmission of car :"+Transmission);
		System.out.println("doors of car :"+doors);
		System.out.println("Tyres of car :"+tyres);
		System.out.println("making of car "+make);
	}
	public void accelerate()
	{
		System.out.println("Car is moving faster..");	
	}
	public void brake()
	{
		System.out.println("Car has stopped..");
	}
	
}
