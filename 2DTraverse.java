package nuaClassroomTutorials;

public class TwoDArrayTraverser 
{

	public static void main(String[] args) 
	{
	
		String [][] names = { {"Abby", "Paige", "Kenny", "Lauren", "Gabbi", "Kiana"},
								{"Jubilee", "Kyla", "Keanu", "Justin", "Jorrin", "Gabe"},
								{"Edward", "Brogan", "Hayden", "Patrick", "Abby", "Paige"},
								{"Kenny", "Lauren", "Gabbi", "Kiana","Jubilee", "Kyla"},
								{ "Keanu", "Justin", "Jorrin", "Gabe","Edward", "Brogan"},
								{"Kenny", "Lauren", "Gabbi", "Kiana","Jubilee", "Kyla"},
								{ "Keanu", "Justin", "Jorrin", "Gabe","Edward", "Brogan"},					
							};
		
		double [][] copyArr = { {0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
								{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
								{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
								{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
								{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
								{0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
								{0.0, 0.0, 0.0, 0.0, 0.0, 0.0} };
		
		int rows = names.length;
		
		int columns = names[0].length;
		
		//for(int n = 0; n < rows; n++)
		//{
		//	System.out.println(names[n][0]);
		//}
		
		//for(int l = 0; l < columns; l++)
		//{
		//	System.out.println(names[0][l]);
		//}
		
		
		//Task 1: Create a method print2DArray() 
		//that is passed a 2D String array and will print
		//out each element in row-major order 
		//(instead of column-major order like we did yesterday). 
		for(int m = 0; m < rows; m++)
		{	
			for(int l = 0; l < columns; l++)
			{
				System.out.println(names[m][l]);
			}
		}
		
		System.out.println(" ")	;
		System.out.println(" ")	;
		

		for(int i = 0; i < columns; i++)
		{	
			for(int k = 0; k < rows; k++)
			{
				System.out.println(names[k][i]);
			}
		}
		
		System.out.println(" ")	;
		System.out.println(" ")	;
		
		//Task 2: Create a method allOnes2D() that is passed a 2D double array,
		//makes an array of the same column and row length but all its literals 
		//are 0.0 called copyArr, and then changes each element inside to 1.0 and 
		//returns copyArr. (So it is passed a 2D array and returns a 2D array with all 0.0).
		allOnes2D(copyArr);

	}

	private static void allOnes2D(double[][] copyArr) 
	{
		int r = copyArr.length;
		int c = copyArr[0].length;
		
		for(int m = 0; m < r; m++)
		{	
			for(int l = 0; l < c; l++)
			{
				copyArr[m][l] = 1.0;
				System.out.println(copyArr[m][l]);
			}
		}
		
		
	}

}
