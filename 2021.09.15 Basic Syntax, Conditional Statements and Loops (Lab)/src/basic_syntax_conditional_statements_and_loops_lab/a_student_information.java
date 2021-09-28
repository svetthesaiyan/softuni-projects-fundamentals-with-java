package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class a_student_information
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=scanner.nextLine();
		System.out.print("Enter your age: ");
		int age=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your average grade for this trimester: ");
		double averageGrade=Double.parseDouble(scanner.nextLine());
		
		System.out.printf("\n"+"Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);
	}
}
