package nuaClassroomTutorials;

public class ArrayTutorials 
{

	public static void main(String[] args) 
	{
		//declare an int array without any values
		int [] arr = null;
		
		//declare an int array of four default terms
		int[] arr2 = new int[4];
		
		//declare an array with three literal values of 4,12, 28
		int[] arr3 = {4,12,28};
		
		int[] arrNewy = {5, 13, 6, 17};
		
		
		//print its contents 
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);

		//prints its first element
		System.out.println("The first element is " + arr3[0] + ".");
		
		//prints its last element
		System.out.println("The last element is " + arr3[arr3.length-1] +".");

		//call method to print first and last element, then change them both to 1
		printAndChangeFirstLast(arr3);
		

		//prints its first element
		System.out.println("The first element is " + arr3[0] + ".");
		
		//prints its last element
		System.out.println("The last element is " + arr3[arr3.length-1] +".");
		
		//call method to return sum of two indices 
		int sum = sumOfTwoElements( arr3, 0, 1);
		System.out.println("The sum is " + sum + ".");	
		
		//call method to return a new array with the same length,
		//but all zero as literals
		int [] newArr = makeSameLengthArrWithZeros(arr3);
	
		//TASK 1: make a method that returns an ARRAY of the first 
		//and last elements of a passed array;  {4, 7, 12, 3} ---returns---> {4,3}
		int [] newy = returnFirstAndLast(arrNewy);
				
		//TASK 2: make a method that changes an array, it should be passed the array
		//and the index you want to change,
		//it will divide specific index by 2;  ({2, 4, 6, 8}, 2) ----> {2, 4, 3, 8}
		int[] yassu = divideAtIndexByTwo(arrNewy, 2);
		
	}

	private static int[] divideAtIndexByTwo(int[] arr, int i) 
	{
		//give index, divide it by two
		arr[i] = arr[i]/2;
		return arr;
	}

	private static int[] returnFirstAndLast(int[] arr) 
	{
		//return first and last elements of given array
		return new int[] {arr[0], arr[arr.length-1]};
	}

	private static int[] makeSameLengthArrWithZeros(int[] arr) 
	{
		//make an array of all 0s with same length of past array
		int[] tempArr = new int[arr.length];
		
		//return new array we made
		return tempArr;
	}

	private static int sumOfTwoElements(int[] arr, int first, int second) 
	{
		// return the sum of the first and second number in the array
		return (arr[first] +arr[second]);
	}

	public static void printAndChangeFirstLast(int[] arr) 
	{
		//print out the first and last elements
		System.out.println("The first and last elements are " + arr[0] + " and " + arr[arr.length-1]+ ".");
		
		//change these elements to 1
		//first element to 1
		arr[0] = 1;
		
		//last element to 1
		arr[arr.length-1] = 1;
		
		//print out the first and last elements
		//System.out.println("The first and last elements are " + arr[0] + " and " + arr[arr.length-1]+ ".");
		
		
	}
	

}
