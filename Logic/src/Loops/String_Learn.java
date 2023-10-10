package Loops;

public class String_Learn {

	public static void main(String[] args) {
		String_Learn mp=new String_Learn();
//		mp.Stringmethod(); //touppercase and lowercase
//		mp.stripleading();
//		mp.trim();
//		mp.contains();
//		mp.substring();
//		mp.startwith_endswith();
//		mp.split();
//		mp.replace();
//		mp.chararray();
//		mp.valueof();
//		mp.isempty(); //isempty and isblank
//		mp.indexof(); //indexof and lastindexof
//		mp.equals();  //equals and equals_ignore_case
//		mp.replacefirst(); //replacefirst and replaceall
//		mp.compareto(); 	//compareto and comparetoignorecase
		mp.Stringmethod1(); //09/09/2023//input"a5" output"aaaaa";
		
		
	}

	private void Stringmethod1() {
		String s="h5b6";
		for(int i =0;i<s.length();i+=2) {
		char letter = s.charAt(i);
		char num=s.charAt(i+1);
		
		for(int ch='1';ch<=num;ch++) {
			System.out.print(letter);
		}
		}
	}

	private void compareto() {
		String s1="parthiban";
		String s2="Parthiban";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
	}

	private void replacefirst() {
		String st="parthiban";
		st=st.replaceFirst("a", "A");
		System.out.println(st);
		st=st.replaceAll("parthiban", "parthiban mani");
		System.out.println(st);
		
	}

	private void equals() {
		String st="parthiban";
		String st1="parthibaN";
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		
	}

	private void indexof() {
		String st="parthiban";
		int index=st.indexOf('p');
		int indexx=st.lastIndexOf('a');
		System.out.println(index);
		System.out.println(indexx);
		
	}

	private void isempty() {
		String a="      ";
		System.out.println(a.isBlank());
		System.out.println(a.isEmpty());
		
		
	}

	private void valueof() {
		String a=String.valueOf(5);
		String b=String.valueOf(10);
		System.out.println(a+b);
		
	}

	private void chararray() {
		String str="parthiban";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]+" ");
		}
		
	}

	private void replace() {
		String str="today is tuesday. tomorrow is wednessday";
		System.out.println(str);
		str=str.replace("is", "was");
		System.out.println(str);
		
	}

	private void split() {
		String str="hi how are you";
		String s[]=str.split("how"); // "how"- removed from split method (or) single letter also we can remove split method
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		
		
	}

	private void startwith_endswith() {
		String str="hi how are you";
		boolean starts=str.startsWith("hi");
		System.out.println(starts);
		boolean starts1=str.endsWith("you");
		System.out.println(starts1);
		
	}

	private void substring() {
		String str="12Hi how are you? ";
		str=str.substring(2);
		System.out.println(str);
		str=str.substring(2, 7);
		System.out.println(str);
		
		
	}

	private void contains() { //contains methods returns boolean values and checked string found or not.
		String str=" Hi how are you? ";
		System.out.println(str.contains("how"));
}

	private void trim() {
		String str=" Hi how are you? ";
		System.out.println(str);
		str=str.trim(); //remove space from front and back given string
		System.out.println(str);
		}

	private void stripleading() { 
		String str=" Hi How Are You ";
		System.out.println(str);
		str=str.stripLeading(); //remove space from start position
		System.out.println(str.length());
		System.out.println(str);
		str=str.stripTrailing(); //remove space from end position
		System.out.println(str.length());
		System.out.println(str);
		
		
		
	}

	private void Stringmethod() {
		String name="parthiban mani";
//		System.out.println(name.toUpperCase());
//		String name2="MANI KANNAN";
//		System.out.println(name2.toLowerCase());
		System.out.println(name);
		for(int i=0;i<name.length();i++) {   	//charAt method
			char ch=name.charAt(i);
			System.out.print(ch+" ");
		}
		
	}

}
