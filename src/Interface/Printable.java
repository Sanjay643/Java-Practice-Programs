package Interface;

public interface Printable {
	void draw();
	void display();
	default void run()
	{
		System.out.println("Run method is running");
	}
	

}
