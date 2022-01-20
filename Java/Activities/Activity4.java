package activities;

public class Activity4 {

	public static void main(String[] args) {
		int [] numArray = {4, 3, 2, 10, 12, 1, 5, 6, 8} ;
	
		int i ;		
		int max = 0;
		
		// Printing Number Array before Sorting.
		System.out.print("Number Array before sorting : { ");
		
		for (i=0; i <= numArray.length - 1 ; i ++)
		{	
			//extracting the biggest number of the array
			if (numArray[i] > max)
			{
				max = numArray[i];
			}
			
			System.out.print(" " + numArray[i] );
			if (i != numArray.length - 1 )
			{
			 System.out.print(" , ");
			}
		}
		System.out.println(" } ");
		
		
		System.out.println("max : " + max );
		
		sortnumArray(numArray, max);
		
	}

	private static void sortnumArray(int[] numArray, int max) 
	{
		int [] numArray1 = new int [numArray.length]; 
		int i;
		int j;
		int smallernum;
		
			
		for (j=0; j <= numArray1.length - 1 ; j ++)
		{	
			smallernum = max + 1;
			
			for (i=0; i <= numArray1.length - 1 ; i ++)
			{	
				// Iterating through the array to find the smallest number of the array.
				if (numArray[i] < smallernum && j == 0)
				{
					smallernum = (numArray[i]); 
					numArray1[j] = smallernum;
				}
				
				// Iterating through the array to find the numbers that is greater than the previous number.
				else if (numArray[i] < smallernum && numArray[i] > numArray1[j-1] )
				{
					smallernum = (numArray[i]);
					numArray1[j] = smallernum;
				}				
			}	
		}	
		
		
		// Printing Number Array after Sorting.
		System.out.print("Number Array After sorting : { ");
		for (i=0; i <= numArray1.length - 1 ; i ++)
		{	
			System.out.print(" " + numArray1[i] );
			if (i != numArray1.length - 1 )
			{
			 System.out.print(" , ");
			}
		}
		System.out.println(" } ");
	}
}
