package data_types_and_variables_lab;

import java.util.Scanner;

public class e_name_concatenation
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName=scanner.nextLine();
		System.out.print("Enter your middle name: ");
		String secondName=scanner.nextLine();
		System.out.print("Enter your family name: ");
		String lastName=scanner.nextLine();
		
		String concat=String.format("%s %s %s", firstName, secondName, lastName);
		System.out.print("\n"+"Your full name is "+concat+".");
	}
}
