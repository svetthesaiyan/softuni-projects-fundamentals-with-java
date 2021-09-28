package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class l_multiplication_table_v2
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number you'd like to multiply: ");
		int number=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter how many times you'd like to multiply said number: ");
		int multiplier=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		if(multiplier<=10)
		{
			for(int i=multiplier; i<=10; i++)
				System.out.println(number+" x "+i+" = "+(number*i));
		}
		else
			System.out.printf("%d x %d = %d", number, multiplier, (number*multiplier));
	}
}
