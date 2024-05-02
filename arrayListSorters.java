package nuaClassroomTutorials;

import java.util.ArrayList;
public class ArrayListSorters 
{

	public static void main(String[] args) 
	{
		//
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		ArrayList<String> names = new ArrayList<String>();
		
		//
		nums.add(3);
		nums.add(4);
		nums.add(2);
		nums.add(1);
		nums.add(5);
		System.out.println(nums);
		
		names.add("Delila");
		names.add("Ciara");
		names.add("Abby");
		names.add("Bea");
		System.out.println(names);
		
		bubbleSortNumbers(nums);
		
		bubbleSortNames(names);
		

	}

	public static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
		
		for(int i = 0; i < nums.size(); i++ )
		{
			for(int l = 0; l < nums.size() - i - 1; l++)
			{
				if(nums.get(l).compareTo(nums.get(l+1)) > 0)
				{
					Integer temp = nums.set(l, nums.get(l+1));
					nums.set(l + 1, temp);
					
				}
		
			}

    		       
		}
		System.out.println(nums);

	}
	
	public static void bubbleSortNames(ArrayList<String> names) 
	{
		
		for(int i = 0; i < names.size(); i++ )
		{
			for(int l = 0; l < names.size() - i - 1; l++)
			{
				if(names.get(l).compareTo(names.get(l+1)) > 0)
				{
					String temp = names.set(l, names.get(l+1));
					names.set(l + 1, temp);
					
				}
		
			}

    		       
		}
		System.out.println(names);

	}
	
	
	

}
