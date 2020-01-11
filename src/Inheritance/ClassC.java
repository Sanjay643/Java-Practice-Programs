package Inheritance;

public class ClassC extends ClassB {
	String address;
	void setDetails(String name,int id) //overriding
	{
		this.name = name;
		this.id = id;
//		this.mobnum = mobnum;
//		this.address = address;
	}
	void displayChge()
	{
		System.out.println("id"+id+" name:"+name+" mobile number:"+mobnum+" Address:"+address);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC c = new ClassC();
		c.setDetails("sanjay",123);
		c.display();
		c.setDetails("sanjay",456);
		c.displayChge();

	}

}
