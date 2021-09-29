package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class j_sum_of_odd_numbers
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter how many uneven numbers starting from '1' you'd like to be counted in the 'for' loop below: : ");
		int iterationCount=Integer.parseInt(scanner.nextLine());
		int number=1;
		int sumOdd=0;
		
		for(int count=1; count<=iterationCount; count++)
		{
			System.out.println(number);
			sumOdd+=number;
			number+=2;
		}
		System.out.print("\n"+"The sum of the "+iterationCount+" uneven numbers above is: "+sumOdd);
	}
}
