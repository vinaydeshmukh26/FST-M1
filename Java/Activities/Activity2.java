package activities;

public class Activity2 {

	public static void main(String[] args) 
	{
		int [] array = {10, 77, 10, 54, -11, 10 };
		
		int sum = 0;
		int i;
		
		boolean myBool;
		
		int num1;
		
		// Loop thru Array
		for (i=0; i <= (array.length - 1); i++ )
		{
			num1 = array[i];
			
			// check if the array value is equal to 10
			if(num1 == 10)
			{
				System.out.println("num1 : " + num1);
				System.out.println("Array Index value = " + i);
				
				sum = sum + num1;
				
				System.out.println("Sum :" + sum);
			}
		}
		
		// compare the sum with 30 to set the boolean flag.
		if (sum == 30)
		{
			myBool = true;
		}
		else 
			myBool = false;

	
		System.out.println("Sum of 10's in the array is equal to 10 :" + myBool);
	

	}
}

