/**
 * This class is a dice rolling program that will be used to 
 * learn new techniques and ultimately create a program that can 
 * receive a user's input in order to roll different amounts of dice.
 */
import java.util.Scanner;
public class DiceRollerProgram 
{

	public static void main(String[] args) 
	{	
		
		//create a scanner
		Scanner rawr = new Scanner(System.in);
		
		String poom = new String(rawr.nextLine());
		
		
		//instantiates int that represents default amount of times that
		//the die can be rolled
			int i = 1;
		
		//loop that rolls die 200 times
		while(i<= 2) 
		{
			//rolls 17 faced die
			System.out.println((int)(Math.random() * 17 +1));
			i++;
		}
		
		//instantiate new string and char for countChar method
		String meow = new String("QQVaaaBaaBBBLLLp");
		char woof = 'a';
		
		//close scanner
		rawr.close();
		
		//give directions
		System.out.println("Give me the amount of dice you want to roll and the amount of faces all the dice are, use the form Dice#dFace#.");
		System.out.println("(#d#, only whole posistive numbers are accepted)");
		
		//instantiate new string for spaceOut method
		String onichann = new String(" If ya had the chance     to change your fate wooja? ");
		
		//calls method that counts how many times a char shows up in a String and 
		//returns that number; method is declared as int to make things neater 
		int l = countChars(meow, woof);
		
		//prints result of countChars method
		System.out.println(l);
		
		//calls method that prints out the number before the d and the number after 
		//the d respectively and point them out as the first and second number. (#d#)
		separateNums(poom);
		
		//calls method that is passed a String and returns a different String that
		//is the same as the passed String without any spaces. 
		spaceOut(onichann);
		
		
	}
	
	/**
	 * This method takes a String and returns a different String that
	 * is the same as the passed String without any spaces.
	 * 
	 * @param onion
	 */
	private static void spaceOut(String onichann) 
	{
		
		String newOnichann = onichann.replace(" ", "");
		System.out.println(newOnichann);
	}

	/**
	 * The method should print out the number before the d and the number after 
	 * the d respectively and point them out as the first and second number. 
	 * @param poom
	 * @return
	 */
	private static void separateNums(String poom) 
	{
		//create 2 new strings to separate the left and right number in terms of d

		// gets string = to first char of string up until the char right before the d
		String left = new String(poom.substring(0, poom.indexOf('d')) );
	
		// gets string = to char right after d until the last char of the string
		String right = new String(poom.substring((poom.indexOf('d')+1), (poom.length())));
		
		//turns strings into ints
		int a = Integer.valueOf(left);
		int b = Integer.valueOf(right);
		
		
		//prints out numbers left and right of d
		System.out.println("The first number is " + a + " and the second number is " + b + ".");
		
		//prints out sum of the two numbers
		//System.out.println("The sum of of your roll is " + (a+b) + ".");
		
		//create method RollDice
		rollDice(a, b);
		
	}
	
	/**
	 * This method rolls the numbers like dice, left number = the amount of dice and
	 * the right number = the amount of faces the dice has. For example, if the String 
	 * is 3d6, instead of printing out "..and their sum is 9" you will now print out 
	 * "and rolling 3 6-sided dice gives 13." (13 is not set in stone- it could be any
	 * number you might get from rolling 3 dice.)
	 * @param a
	 * @param b
	 * @return
	 */
	private static void rollDice(int a, int b) 
	{
		//for loop that uses ints a and b from separateNums method, and rolls a amount of 
		//dice with b amount of faces
		int llama = 0;
		
		for(int i = 1; i <= a; i++) 
		{
			//rolls b faced die
			int beaver = ((int)(Math.random() * b +1));
			
			llama += beaver;
		}
		System.out.println("Rolling " + a + " " + b + "-faced dice gave you " + llama);
	}

	/**
	 * This method counts how many times a char shows up in a String and 
	 * returns that number.
	 * @param meow
	 * @param woof
	 * @return
	 */
	private static int countChars(String meow, char woof) 
	{
		//instantiate int that represents default amount of any
		//char in string
		int moo = 0;
		
	    //for loop that counts amount of times a char occurs in the string
	    for(int i=0; i < meow.length(); i++)
	    {    
	    	//if the char at the index is = to the given char, add one to the
	    	//default amount of chars
	    	if(meow.charAt(i) == woof) 
	    	{
	    		 moo++;
	    	}
	    	
	    }
	    //returns amount of times that the char occurs in the string
	    return moo;
		
	}

}
