package Loops;

public class String_palindrome {

	public static void main(String[] args) {
		String name="AMMA";
		String Name1="";
		for(int i=name.length()-1;i>=0;i--) {
			Name1=Name1+name.charAt(i);
		}System.out.println(name);
		if(name.equals(Name1)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is Not Palindrome");
		}

	}

}
