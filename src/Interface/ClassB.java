package Interface;

public class ClassB implements Printable,Calculative{
	public void draw()
	{
		System.out.println("Draw a circle");
	}
	public void display()
	{
		System.out.println("Circle is drawed in printable interface");
	}
	
//	public void display() {
//		System.out.println("Display method in calculative");
//		
//	}
	int a=10,b=20;
	public int add()
	{
		return a+b;
	}
	public int sub()
	{
		return a-b;
	}
	public int mul()
	{
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.draw();
		b.display();
		b.run();
		System.out.println(b.add());
		System.out.println(b.sub());
		System.out.println(b.mul());
		

	}
	

}
