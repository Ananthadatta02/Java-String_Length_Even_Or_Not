package test_27_03_25;

import java.util.Scanner;

public class StringLengthEvenOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.next();
		int count = 0;
		for(int i=0;i<=st.length()-1;i++)
		{
			count++;
		}
		if(count%2==0)
		{
			st = st + "bye";
			System.out.println(st);
		}
		else
		{
			System.out.println("First Char " + st.charAt(0));
			System.out.println("Last Char " + st.charAt(st.length()-1));
		}
	}
}
