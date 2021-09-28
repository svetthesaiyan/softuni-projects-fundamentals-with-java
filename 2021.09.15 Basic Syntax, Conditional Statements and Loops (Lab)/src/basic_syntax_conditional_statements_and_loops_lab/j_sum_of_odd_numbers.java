package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class j_sum_of_odd_numbers
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int number=1;
		int sumOdd=0;
		
		for(int count=1; count<=n; count++)
		{
			System.out.println(number);
			sumOdd+=number;
			number+=2;
		}
		System.out.print("Sum: "+sumOdd);
	}
}
