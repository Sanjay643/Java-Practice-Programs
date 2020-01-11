
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=50;
		int j=0;
		int[] arr = new int[100];
		
		try {
			//int a = 10/0;
			int res = i/j;
			System.out.println(arr[102]);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			//System.out.println("can't divide by zero" );
			System.out.println((i/j+2)); //exception handling
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
