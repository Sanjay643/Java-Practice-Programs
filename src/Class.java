import java.util.Scanner;

public class Class {
	int num;
	String name;
	void insertData(int n,String str)
	{
		num = n;
		name = str;
	}
	Class(int n,String str) //Parameterised constructor
	{
		num = n;
		name = str;
	}
	static String clge="IIT"; //static variable 
	void display()
	{
		System.out.println("Number="+num+" Name:"+name+" College:"+clge);
	}
	
	 static int cube(int n) // static method 
	{
		return n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Class obj = new Class(20,"sanjay");
		Class obj1 = new Class(27,"Hello Sanjay");
		obj.num = scan.nextInt();
		obj.name = scan.next();
		obj.insertData(20, "sanjay");
		obj1.insertData(25,"Hello ajith");
		Class.clge = "Sri eshwar";  // static can be accessed with class name 
		obj.display();
		obj1.display();
		
		//scan.close();
		//System.out.print("Hello");

		System.out.print(Class.cube(5));
		System.out.print(Class.cube(5));
		System.out.print(Class.cube(5));

		

	}

}
