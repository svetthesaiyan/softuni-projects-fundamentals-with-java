package data_types_and_variables_lab;

import java.util.Scanner;

public class h_letter_case
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a letter from the English alphabet: ");
		char symbol=scanner.nextLine().charAt(0);
		if(symbol>=65 && symbol<=90)	// if(symbol>='A' && symbol<='Z'), за да не се занимаваме с ASCII стойностите 
			System.out.print("The letter \'"+symbol+"\' is uppercase.");
		else	// else if(Character.isUpperCase(symbol))
			System.out.print("The letter \'"+symbol+"\' is lowercase.");
	}
}
