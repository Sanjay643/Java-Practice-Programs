
public class Overloading {
	int num;
	String name;
	String clge;
	void setDetails(int num)
	{
		this.num=num;
		System.out.println("Number="+num);
	}
	void setDetails(int num,String name)
	{
		this.num = num;
		this.name = name;
		System.out.println("Number="+num+" Name="+name);
	}
	void setDetails(int num,String name,String clge)
	{
		this.num = num;
		this.name = name;
		this.clge = clge;
		System.out.println("Number="+num+" Name="+name+"College name="+clge);
	} //overloading can be also done in changing the data type 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol = new Overloading();
		ol.setDetails(10);
		ol.setDetails(29,"sanjay");
		ol.setDetails(100,"Sanjay","Sri eshwar");
		

	}

}
