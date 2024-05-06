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
		
		for(int m = 0; m < rows; m++)
		{	
			for(int l = 0; l < columns; l++)
			{
				System.out.println(names[m][l]);
			}
		}

	}

}
