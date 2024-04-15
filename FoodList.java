package nuaClassroomTutorials;

import java.util.ArrayList;

public class ArrayListMethodsInDepth 
{

	public static void main(String[] args) 
	{
		//instantiate an empty ArrayList foods that stores Strings
		ArrayList<String> foods = new ArrayList<String>();
		
		//add Apples, Bread, and Cookies to the list
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		//print out the length of the foods ArrayList
		System.out.println(foods.size());
		
		//inside of a print statement, add the String "Dole Whip" to foods. 
		//In the line comment for this code, state what it prints: 
			//It prints "true"
			//this returns true no matter the case
		System.out.println(foods.add("Dole Whip"));
		
		//inside of a print statement, use the .set(E) method to change "Bread" 
		//in foods to "Butter". Comment what it prints. 
			//It prints "Bread"
			//this returned the object that was at the given index before it was replaced,
			//in this case we swapped "Bread", which was at index = 1, with "Butter", so
			//it printed out the object that was at index = 1 before "Butter" which was
			//"Bread"
		System.out.println(foods.set(1, "Butter"));
		
		//inside of a print statement, use the .remove(int) method to remove 
		//"Cookies" from foods. Comment what it prints.
			//It prints "Cookies"
			//this returned the object that we removed , in this case
			//since it removed "Cookies" it returned "Cookies"
		System.out.println(foods.remove(2));
		
		
		
		

	}

}
