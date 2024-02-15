/**
 * a class that is meant to store the grades
 * of a student
 * 
 * create three attributes/properties, 
 * a constructor,
 * and some methods.
 */
public class Student 
{
	private double scienceGrade;
	private double mathGrade;
	private double theologyGrade;
	private int gradeLevel;
	private String name;
	
	/**
	 * this constructor lets us store information
	 * about a student such as their grades, grade
	 * level, and name.
	 * 
	 * we pass it numbers to be the initial values
	 * of the data attributes.
	 * 
	 * @param a science grade
	 * @param b math grade
	 * @param c theology grade
	 * @param A grade level
	 * @param one name
	 */
	public Student(double a, double b, double c, int A, String one)
	{
		scienceGrade = a;
		mathGrade = b;
		theologyGrade = c;
		gradeLevel = A;
		name = one;
	}
	
	//functionalities: the main one is to store the 
	//grades of a student.
	
	/**
	 * this method adds up the student's grades and divides 
	 * the sum by three (the amount of classes) to average 
	 * the GPA of the student.
	 * 
	 * @return studentGPA, the student's average GPA
	 */
	public double getGPA()
	{
		double studentGPA = (scienceGrade + mathGrade + theologyGrade)/3;
		return studentGPA;
	}
	
	/**
	 * this method introduces a student along with
	 * their atributes. (GPA, name, and grade level)
	 */
	public void introduceSelf()
	{
		System.out.println("I am a student in grade " + gradeLevel + 
				". My name is " + name + " My average GPA is "+ getGPA());
	}
}
