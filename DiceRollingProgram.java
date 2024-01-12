/**
 * This class is a dice rolling program that will be used to 
 * learn new techniques and ultimately create a program that can 
 * receive a user's input in order to roll different amounts of dice.
 */
public class DiceRollerProgram 
{

	public static void main(String[] args) 
	{
		//instantiates int that represents default amount of times that
		//the die can be rolled
		int i = 1;
		
		//loop that rolls die 200 times
		while(i<= 200) 
		{
			//rolls 17 faced die
			System.out.println((int)(Math.random() * 17 +1));
			i++;
		}
		
		String meow = new String("QQVaaaBaaBBBLLLp");
		char woof = 'a';
		
		
		int l = countChars(meow, woof);
		
		System.out.println(l);
		
	
		
		
		
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
	            moo++;
	    }
	    //returns amount of times that the char occurs in the string
	    return moo;
		
	}

}
