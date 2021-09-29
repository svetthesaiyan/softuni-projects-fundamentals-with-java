package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class b_division
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=Integer.parseInt(scanner.nextLine());
		if(number%10==0)
			System.out.print("The number you entered is divisible by 10.");
		else if(number%7==0)
			System.out.print("The number you entered is divisible by 7.");
		else if(number%6==0)
			System.out.print("The number you entered is divisible by 6.");
		else if(number%3==0)
			System.out.print("The number you entered is divisible by 3.");
		else if(number%2==0)
			System.out.print("The number you entered is divisible by 2.");
		else
			System.out.print("The number you entered isn't divisible by neither '10', nor '7', '6', '3' or '2'.");
	}
}
