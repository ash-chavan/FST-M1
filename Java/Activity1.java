package Activities;
public class Activity1 {

	public static void main(String[] args) {
		
		Activity1Car toyota = new Activity1Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.Transmission = "Manual";
        
        toyota.displayCharacteristics();
        toyota.accelerate();
        toyota.brake();

		

	}

}
