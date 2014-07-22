import java.util.*;

public class SimpleClass
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int assignment1;
		int assignment2;
		int assignment3;
		
		System.out.print("Enter Assignment 1 Mark: ");
		assignment1 = input.nextInt();
		
		System.out.print("Enter Assignment 2 Mark: ");
		assignment2 = input.nextInt();
		
		System.out.print("Enter Assignment 3 Mark: ");
		assignment3 = input.nextInt();
		
		double average;
		
		average = (assignment1 + assignment2 + assignment3) / 3.0;
		
		average = ((int)(average * 100)) / 100.0;
		
		System.out.println("Average is: " + average);
	}
	
	@Override
	public String toString()
	{
		String result;
		result = "Hi";
		result += "\nHow are you?";
		return result;
		
	}

}
