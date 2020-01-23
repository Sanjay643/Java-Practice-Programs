import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class List {

	private static Object ListIterator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sanjay");
		al.add("Ajith");
		al.add("Surya");
		al.add("Vijay");
		al.add("Raju");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Raju");
		al1.add("Vijay");
		al1.add("Krithika");
		al1.add("Pradeep");

		al.remove(0);
		//al.clear();
		//al.addAll(al1);
		al.retainAll(al1);
		
		/*Enumeration<String> e = Collections.enumeration(al);
		for(String str1: e)
		{
			System.out.println(str1);
		}*/
		
		System.out.println(al1);
		System.out.println(al);
		
		
		/*Iterator  itr =  al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		/*for(String str: al)
		{
			if(str.contains("Krithika"))
				break;
			System.out.println(str);
		}*/
		
		System.out.println(System.currentTimeMillis());
	  /* ListIterator<String> litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.hashCode());
		}*/
		

	}

}
