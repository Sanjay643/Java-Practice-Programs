import java.util.Scanner;

public class Strings_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "Sanjay"; //create object by using literal
		String s1 = new String(s); //create object using new keyword
		String s2 = new String("welcome");
		
		String s3;
		s3 = s2 + s1;  // string concat
		System.out.println(s3);
		
		//String s4 = sc.next(); //to get the input from users
		String s5 = "Salman";
		String s6 = "Sanjay";
		
		System.out.println(s1.equals(s5));
		System.out.println(s==s6);
		System.out.println(s1.compareTo(s2));
		
	    String s7 = "JAVA IS A LANGUAGE";
	    System.out.println(s7.substring(1,10)); //substring
	    
	    System.out.println(s5.toUpperCase());
	    System.out.println(s7.toLowerCase());
	    
	    String s8 = "   whi te s pa ce    ";
	    System.out.println(s8.trim());
	    
	    System.out.println(s7.startsWith("JA"));
	    System.out.println(s7.endsWith("E"));
	    
	    System.out.println(s.charAt(3));
	    
	    System.out.println(s7.length());
	    char a = 'c';
	    String r = String.valueOf(a);
	    System.out.println(r+10);
	    System.out.println(s7.replace("JAVA","python"));
	    
	    
	    
	    
	    
		
		
		
		
		
		
		sc.close();
		
		
		
		}
	}
