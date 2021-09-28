package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class b_passed 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your average grade for this trimester: ");
		double averageGrade=Double.parseDouble(scanner.nextLine());
		if(averageGrade>=3)
			System.out.print("\n"+"Passed!");
	}
}
