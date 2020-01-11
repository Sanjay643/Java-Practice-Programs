
public class StringBuilder_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("hello");//mutable object
		sb.append("Sanjay");
		String s = "Engineering";
		StringBuilder sb1 = new StringBuilder(s);
		sb1.insert(11,"Student");
		System.out.println(sb);
		System.out.println(sb1); //insert printing statement
		
		sb1.replace(2,8,"test");
		System.out.println(sb1); //replace printing statement
		
		String s1 = "Kumar";
		StringBuilder sb2 = new StringBuilder(s1);
		
		sb2.delete(1,3);
		System.out.println(sb2); //delete
		
		System.out.println(sb1.capacity()); //so it is 16+length of string
		sb1.ensureCapacity(60); //use to change the minimum capacity
		System.out.println(sb1.capacity());
		
		
		StringBuffer strbuf = new StringBuffer("Hello"); //same as the StringBuilder
		//same methods can be used in StringBuffer also
		
		strbuf.append("sanjay");
		strbuf.reverse();
		
		
		
		
		
		

	}

}
