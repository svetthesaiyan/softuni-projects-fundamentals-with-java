package data_types_and_variables_lab;

import java.util.Scanner;

public class j_special_numbers
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the amount of numbers starting from \'1\' you'd like for me to check whether or not they're special!"+"\n"+"Enter said amount here: ");
		int loops=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		for(int i=1; i<=loops; i++)
		{
			int sum=0;
			int num=i;
			while(num!=0)
			{
				sum+=num%10;
				
				num/=10;
			}
			
			if(sum==5 || sum==7 || sum==11)
				System.out.println(i+" is exquisite!");
			else
				System.out.println(i+" is mundane...");
		}
	}
}
