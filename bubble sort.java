public class BubbleSort 
{

	public static void main(String[] args) 
	{
		//call a method that generates an array 
		//of random elements
		makeRandom();
		
		//call method that bubble sorts the generated array
		//from least to greatest
		bubbleSort(makeRandom());
		
		//call method that is able to print out the
		//elements of the generated array
		printArr(bubbleSort(makeRandom()));

	}

	/**
	 * this method is able to bubble sort an array of any length
	 * by comparing the index with the number right after it and
	 * which of the two is greater so it can order the array properly.
	 * @param arr
	 * @return
	 */
	private static int[] bubbleSort(int[] arr) 
	{
		//declare int assigned the value of the length of array
		int n = arr.length; 
		
		//for loop to traverse the array all the way to the last
		//element
        for (int i = 0; i < n - 1; i++) 
        {   
        	//for loop that again traverses the array with the purpose of
        	//comparing each element at index j to the index at j+1
        	for (int j = 0; j < n - i - 1; j++) 
        	{
               //swaps the two elements should the one at index j be greater
        	   //than the one at the index of j+1, in turn pushing all the greater
        	   //elements towards the end and lesser ones to the front
        		if (arr[j] > arr[j + 1]) 
                { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp;
                }
        	}
        }
        
        return arr;
	}

	/**
	 * This method takes in an int array and 
	 * give it random integer elements
	 * @return
	 */
	private static int[] makeRandom() 
	{
		//creates array with 2000 elements 
		int[] bigNums = new int[2000];
		
		//declares an int and assigns it the value of the length of the bigNums array
		int len = bigNums.length;
		
		//for loop that traverses the array
		for (int i = 0; i < len; i++)
		{
			//declare a random number from 1-1000
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			
			//set the element of the array to the random number
			bigNums[i] = randomNumber;
			
		}
		
		//return the new array
		return bigNums;
		
	}
	
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
		
		
		}
	}

}
	
