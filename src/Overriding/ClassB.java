package Overriding;

public class ClassB  extends ClassA{
	int stu_id = 100; 
	String mobnum = "9876780987";
	
	
	//super.show();
	void show()
	{
		super.show(); //used to access the immediate parent class method
		System.out.println("Student id:"+stu_id+" Mobile number:"+mobnum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.show();
		

	}

}
