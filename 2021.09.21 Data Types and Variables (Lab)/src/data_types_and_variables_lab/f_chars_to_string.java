package data_types_and_variables_lab;

import java.util.Scanner;

public class f_chars_to_string
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		String data="";
		
		for(int i=1; i<=3; i++)
		{
			if(i==1)
				System.out.print("Enter first letter: ");
			else if(i==2)
				System.out.print("Enter second letter: ");
			else
				System.out.print("Enter third and final letter: ");
			
			char symbol=scanner.nextLine().charAt(0);
			data+=symbol;
		}
		
		System.out.print("\n"+"The 3 letters you entered lumped together are: ");
		for(int i=0; i<=data.length()-1; i++)
			System.out.print(data.charAt(i));
		
//		String firstSymbol=scanner.nextLine();
//		String secondSymbol=scanner.nextLine();
//		String thirdSymbol=scanner.nextLine();
//		
//		String concatSymbol=String.format("%s%s%s", firstSymbol, secondSymbol, thirdSymbol);
//		System.out.print(concatSymbol);
	}
}
