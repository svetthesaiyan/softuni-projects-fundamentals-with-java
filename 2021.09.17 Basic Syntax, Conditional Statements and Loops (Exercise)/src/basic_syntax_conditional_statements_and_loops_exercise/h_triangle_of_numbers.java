package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class h_triangle_of_numbers
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a random number and I'll generate a pyramid with the number you've input!"+"\n"+"Enter your number here: ");
		int n=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		for(int row=1; row<=n; row++)
		{
			for(int col=1; col<=row; col++)
				System.out.print(row + " ");
			
			System.out.println();
		}
	}
}
