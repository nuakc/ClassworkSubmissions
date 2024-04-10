package nuaClassroomTutorials;

public class InsertionSorter 
{

	public static void main(String[] args) 
	{
		int[] uno = {2, 4, 6, 8, 5, 10, 12};
		
		int[] ichi = {5,2,6,7,1,3,8,4};
		
		int index = 4;
		
		//TASK #1: create method assigned an array of ints
		
		//TASK #2: Change the previous method so that it is 
		//passed an int index and will sort the value at that 
		//index instead of the last index.
		arrayShifter(uno, index);
		
		insertionSort(ichi);
		
		printArr(arrayShifter(uno, index));
		
		printArr(insertionSort(ichi));
		

	}

	/**
	 * a method insertionSort (that is passed an int array) 
	 * with a for loop that traverses the array from left to 
	 * right. On each iteration of the loop (in the work) write 
	 * code that calls the arrayShifter method and passes it the 
	 * array and the current loop index.
	 * @param ichi
	 */
	private static int[] insertionSort(int[] arr) 
	{ 
		//for loop that traverses the int array
		for(int i = 0; i < arr.length; i++)
		{
			arrayShifter(arr, i);
		}
		
		return arr;
	}

	/*
	 * method when passed an 
	 * array of ints, will take the last element
	 *  and sort it into the right place.
	 */
	public static int[] arrayShifter(int[] arr, int index) 
	{
		//declare int i and assign array length
		int i = index;
		
		//while loop that checks if  index element is less than 
		//the element before it
		while(i>0 && arr[i] < arr[i-1])
		{
			//switches elements 
			int temp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = temp;
			i--;
			
		}
		
		return arr;
		
	}
	
	/**
	 * this method is passed an array and prints out
	 * each element one by one
	 * @param arr
	 */
	public static void printArr(int[] arr) 
	{
		//TASK 1: make a variable to be the 'traverse'
		int traverser;
		
		//TASK 2: make a loop. we want it to traverse every character, so
		//it should go from start to finish of the loop
		for (traverser = 0; traverser <= arr.length-1; traverser++)
		{
		//TASK 3: prove that it can count along with right amount of indeces
			System.out.println(arr[traverser]);
		
		//TASK 4: changes TASK 3 to print each element instead of each
		//index
		}

	}


}
