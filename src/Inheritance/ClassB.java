package Inheritance;

public class ClassB extends ClassA {
	void display()
	{
		System.out.println("id:"+id+" name:"+name+" mobile number:"+mobnum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display();
		
		ClassB b = new ClassB();
		b.setDetails("Sanjay",100);
		b.display();
		

	}

}
