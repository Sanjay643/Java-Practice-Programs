package Exceptions;

import java.util.Scanner;

public class Example1 {
	static void validates(int age) throws ArithmeticException
	{
		if(age<18)
			throw new ArithmeticException("Invalid");
		else
			System.out.println("Eligible to vote");
	}
	

	//private static char[] NullPointerException;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=50;
		int j=0;
		int[] arr = new int[100];
		String str = null;
		validates(16);
		try {
			try {
			int[] arr1 = new int[10];
			arr1[10]=10;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			//int a = 10/0;
			int res = i/j;
			System.out.println(arr[102]);
			System.out.println(str.length());
		}
		
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			//System.out.println("can't divide by zero" );
			System.out.println((i/(j+2))); //exception handling
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("NullPointerException");
		}
		
		finally
		{
			sc.close();
			System.out.println("finally block is excuted");
		}
		
		
		
		

	}

}
