package data_types_and_variables_lab;

import java.util.Scanner;

public class g_reversed_chars
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
		
		System.out.print("\n"+"The 3 letters you entered but reversed are: ");
		for(int i=data.length()-1; i>=0; i--)
			System.out.print(data.charAt(i));
		
//		char firstChar=scanner.nextLine().charAt(0);
//		char secondChar=scanner.nextLine().charAt(0);
//		char thirdChar=scanner.nextLine().charAt(0);
//		
//		System.out.println(thirdChar+" "+secondChar+" "+firstChar);
	}
}
