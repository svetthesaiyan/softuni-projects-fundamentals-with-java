package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class k_multiplication_table 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number you'd like to multiply up to 10: ");
		int number=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		for(int i=1; i<=10; i++)
			System.out.println(number+" x "+i+" = "+(number*i));
	}
}
