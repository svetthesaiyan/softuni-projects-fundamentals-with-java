package basic_syntax_conditional_statements_and_loops_lab;

public class i_divisible_by_3 {
	public static void main(String[] args) 
	{
		int counter=0;
		System.out.println("Here are all of the numbers divisible by 3 up to 100:");
		
		for(int i=3; i<=99; i++)
		{
			if(i%3==0)
			{
				counter++;
				System.out.println("№"+counter+" is: "+i);
			}
		}
	}
}
