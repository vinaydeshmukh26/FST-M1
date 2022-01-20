package activities;

	public class Activity1 
	{
		public static void main(String[] args) 
		{
			System.out.println("Activity-1 : ");
				
			Car Tata = new Car();
			Tata.make = 2014;
			Tata.color = "Black";
			Tata.transmission = "Manual";
		
			Tata.displayCharacteristics();
			Tata.accelarate();
			Tata.brake();
		}
	}
	