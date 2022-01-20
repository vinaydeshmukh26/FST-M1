package activities;

	public class Car
	{
	 	String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		
	 //Constructor Car
	 	Car ()
		{
	// 		System.out.println("Car Constructor");
	 		tyres = 4;
	 		doors = 4;
		}
	 	
	 	public void displayCharacteristics() 
	 	{
	 		System.out.println("Make of the Car is : " + make);
	 		System.out.println("Color of the Car is : " + color);
	 		System.out.println("Tramission of the Car is : " + transmission);
	 		System.out.println("No of tyres Car has : " + tyres);
	 		System.out.println("No of doors Car has : " + doors);
	 	}
	 	
	 	public void accelarate()
	 	{
	 		System.out.println("Car is moving forward.");
	 	}
	 		
	 	public void brake()
	 	{
	 		System.out.println("Car has stopped.");
	 	}	 	
		
	}
	