package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class d_print_and_sum
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your initial number: ");
		int startNumber=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter your concluding number: ");
		int endNumber=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		int numberSum=0;
		
		for(int number=startNumber; number<=endNumber; number++)
		{
			System.out.print(number+" ");
			numberSum+=number;
		}
		
		System.out.print("\n"+"The sum of the above numbers is: "+numberSum);	
	}
}
