package nuaClassroomTutorials;

public class ArrayTraversalMethodsHw 
{

	public static void main(String[] args) 
	{
		double[] threeSame = {2.0, 8.8, 8.8, 8.8, 9.0, 3.1}; 
		//TASK #5: make a method that is passed a double array
		checkThreeSame(threeSame);
		System.out.println(checkThreeSame(threeSame));
		
		int[] allEven = { 1, 3, 6};
		//TASK #4:make a method that is passed an int array
		checkAllEven(allEven);
		System.out.println(checkAllEven(allEven));
		
		int[] anyEven = { 1, 6, 9};
		//TASK #3: make a method that is passed an int array
		checkIfAnyEven(anyEven);
		System.out.println(checkIfAnyEven(anyEven));
		
		double[] average = { 3.1, 4.2, 5.0, 6.2, 6.9};
		//TASK #2: make a method that is passed an array of doubles
		checkAverage(average);
		System.out.println(checkAverage(average));
		
		int[] value =  { 2, 6, 3, 9, 1, 1, 4};
		//TASK #1: make a method that is passed an int array
		checkHighestValue(value);
		System.out.println(checkHighestValue(value));
		
		

	}

	public static int checkHighestValue(int[] arr) 
	{
		//
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
		
		
	}

	public static double checkAverage(double[] arr) 
	{
		//
		double sum = 0.0;
		int length = arr.length;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		double avg = sum/length;
		return avg;
		
	}

	/**
	 * a method that is passed an int array and returns whether or 
	 * not the array has any even numbers in it.
	 * 
	 * @param arr
	 * @return
	 */
	public static boolean checkIfAnyEven(int[] arr) 
	{
		//
		int traverser = 0;
		boolean isAllEven = false;
		
		for(; traverser <= arr.length-1; traverser++ )
		{
			if(arr[traverser]%2 == 0)
			{
				isAllEven = true;
			}
			
		}
		
		
		return isAllEven;		
	}

	/**
	 * a method that is passed an int array and returns whether or not 
	 * the array has ALL even numbers in it.
	 * 
	 * @param arr
	 * @return
	 */
	public static boolean checkAllEven(int[] arr) 
	{
		//
		int traverser = 0;
		boolean isAllEven = true;
		
		for(; traverser < arr.length; traverser++ )
		{
			if(arr[traverser]%2 != 0)
			{
				isAllEven = false;
			}
			
		}
		
		
		return isAllEven;
		
	}

	/**
	 * a method that is passed a double array and returns 
	 * whether or not three consecutive doubles of the same 
	 * value appear in the array.
	 * 
	 * @param arr
	 */
	public static boolean checkThreeSame(double[] arr) 
	{
		//
		int traverser = 0;
		boolean hasThree = false;
		
		for(; traverser <= arr.length-3; traverser++)
		{
			if(arr[traverser] == arr[traverser +1] 
					&& arr[traverser +1] == arr[traverser + 2])
			{
				hasThree = true;
			}

		}
		
		return hasThree;
	}

}
