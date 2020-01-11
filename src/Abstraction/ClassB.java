package Abstraction;

public class ClassB extends ClassA {
	void details()
	{
		Empid = 100;
		Empname = "Sanjay";
	}
	void show()
	{
		System.out.println(Empid+" "+Empname);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA b = new ClassB();
		b.details();
		b.show();
		
	
	
	}

}
