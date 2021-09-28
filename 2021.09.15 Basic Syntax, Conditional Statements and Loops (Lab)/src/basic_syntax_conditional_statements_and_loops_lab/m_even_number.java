package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class m_even_number 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter an even number: ");
		int number=Integer.parseInt(scanner.nextLine());
		int counter=1;
		
		while(number%2!=0)
		{
			if(counter==1)
				System.out.println("That's not an even number, is it, you absolute muppet..."+"\n"+"Enter an actual even number this time, mate, eh?");
			else
				System.out.println("I don't have all day you know...");
			
			number=Integer.parseInt(scanner.nextLine());
			counter++;
		}
		
		System.out.print("\n"+"The absolute value of your number is: "+Math.abs(number));
	}
}
