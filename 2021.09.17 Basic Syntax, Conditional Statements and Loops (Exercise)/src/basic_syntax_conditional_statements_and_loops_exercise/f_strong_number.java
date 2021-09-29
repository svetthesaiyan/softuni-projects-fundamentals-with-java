package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class f_strong_number
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Pick a number and I'll tell you whether it's strong or not!"+"\n"+"Enter your number here: ");
		int number=Integer.parseInt(scanner.nextLine());
		int startNumber=number;
		int startNumberFactorialDigitSum=0;
		
		while(number!=0) // когато вече няма повече цифри след последното целочислено делене, цикълът се прекратява
		{
			int lastDigit=number%10;	// отделяме последната цифра от числото
			int factorial=1;
			
			for(int i=1; i<=lastDigit; i++)
				factorial*=i;
			
			startNumberFactorialDigitSum+=factorial;
			number/=10;	// премахваме последната цифра от числото, за да може 'lastDigit' да премине към следващата цифра в следващата итерация на цикъла
		}
		
		System.out.println();
		if(startNumber==startNumberFactorialDigitSum)
			System.out.print("Oh, it's strong alright, mighty strong!");
		else
			System.out.print("Your number is weak and fimble...");
	}
}
