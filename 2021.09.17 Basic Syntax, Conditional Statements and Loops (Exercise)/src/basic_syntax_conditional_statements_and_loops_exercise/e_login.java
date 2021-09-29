package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class e_login
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter your username: ");
		String username=scanner.nextLine();
		String password="";
		
		for(int symbolPosition=username.length()-1; symbolPosition>=0; symbolPosition--)	// алгоритъм за обръщане на текст обратно 
		{
			char currentSymbol=username.charAt(symbolPosition);
			password+=currentSymbol;
		}
		
		int failedAttempts=0;
		System.out.print("Enter your password: ");
		String input=scanner.nextLine();
		while(!input.equals(password))
		{
			failedAttempts++;
			if(failedAttempts==4)
			{
				System.out.print("\n"+"You have incorrectly entered your password 4 consecutive times and as a result you're blocked!"+"\n"+"Please try again in 30 minutes.");
				break;
			}
			
			System.out.println("Incorrect password. Try again.");
			input=scanner.nextLine();
		}
			
		if(input.equals(password))
			System.out.printf("\n"+"%s has logged in successfully.", username);
	}
}
