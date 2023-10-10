package Loops;

import java.util.Scanner;

public class String_ownlogic {
	public static String s3="";

	public static void main(String[] args) {
		
		String_ownlogic mp=new String_ownlogic() ;
		mp.String_lower_class();	//06/09/2023
//		mp.String_upper_class();
//		mp.name_string();
//		mp.name_string1();
//		mp.name_string2();
//		mp.pre_defined_method();
//		mp.remove_space(); 	//07/09/2023	 if-else
//		mp.remove_space1(); //simple if
//		mp.remove_space2(); //strip leading
//		mp.remove_space3(); 	//strip trailing
//		mp.remove_space4(); 	//trim
//		mp.string_check(); 	//contains methods
//		mp.remove_unwanted_space(); 	//08/09/2013 Intermediate space remove
//		mp.remove_unwanted_space1(); //start,intermediate and end space remove
//		mp.array_sorted();	
//		mp.string_interchange(); //private String reverse combined
//		mp.decimal_to_binary();
//		mp.array_swapping();
		
		
		
		
	}

	private void array_swapping() {
		int[] ar= {10,20,30,40,50};
		int temp=ar[0];
		int i;
		for(i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
			
		}
		ar[i]=temp;
		for(int j=0;j<ar.length;j++) {
			System.out.print(ar[j]+" ");
		}
		
	}

	private void decimal_to_binary() {
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Number");
	   int no=sc.nextInt();
	   String total="";
	  while(no>=1)
	  {
	   int rem=no%2;
	   total=total+rem;
	   no=no/2;
	  }
	  System.out.println(total);
	  }

	private void string_interchange() { //private String reverse
		String s = "Today is Friday parthiban";
    String s2="", s3="";
    for(int i=s.length()-1; i>=0; i--)
    {
      if(s.charAt(i)!=' ')
        s2 = s2 + s.charAt(i);
      else
      {
        reverse(s2);
        s2 = "";
      }
    }
    s3 =reverse(s2);
    System.out.println(s3);
    }

//	private String reverse(String name) { //mp.string_interchange() combined
//		
//		for(int i=name.length()-1; i>=0; i--){
//	      s3 = s3+name.charAt(i);
//	    }
//	    s3 = s3+" ";
//	    return s3;
//	  }

	private void array_sorted() {
		int no[]= {18,15,25,62,15,32,15};
		for(int i=0,j=0;i<no.length;i++) {
			if(no[i]<=15) {
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
				j++;
				}
			}
			for(int i=0;i<no.length;i++) {
				System.out.print(no[i]+" ");
				
			}
			
		}
	

	private void remove_unwanted_space1() {
		String s="how            are      you";
	 boolean space=true;
	 for(int i=0;i<s.length();i++) {
	 
	   if(s.charAt(i)!=' ') {
	    System.out.print(s.charAt(i));
	    space=false;
	    
	   }
	   else if(space==false) {
	    System.out.print(s.charAt(i));
	    space=true;
	   }
	   }
	}

	private void remove_unwanted_space() {
		String s=" hi  how   are   you?    ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') 
				System.out.print(s.charAt(i));
			else {
				System.out.print(s.charAt(i));
				for(int j=i;j<s.length();j++) {
					if(s.charAt(j)==' ')
						continue;
					else {
						i=j-1;
						break;
					}
				}
			}
			
		}
	}

	private void string_check() {	//contains method
		String s1="today is thursday";
		String s2="is";
		for(int i=0;i<s1.length();i++) {
			if(s2.charAt(0)==s1.charAt(i)) {
				int count=0;
				for(int j=0;j<s2.length();j++) {
					if(s2.charAt(j)==s1.charAt(i)) {
						count++;
						i++;
						
					}
				}
				if(count==s2.length()) {
					System.out.println("yes contains");
					break;}
					else {
						System.out.println("no given word not found");
				}
			}
		}
		
	}

	private void remove_space4() { 	//trim
		boolean first=false,last=false;
		String s="    how are you?      ";
		int start=0,end=s.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&& first==false) {
				start++;
			}
			else {
				first=true;
			}
			if(s.charAt(end)==' '&& last==false) {
				end--;
				
			}
			else {
				last=true;
			}
			if(first==true&&last==true) {
				for(int j=start; j<=end;j++)
			          System.out.print(s.charAt(j));
			        break;
			}
		}
		
	}

	private void remove_space3() {
		String s="how are you    ";
		int last=s.length()-1;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				last =i;
				break;
			}
		}
		for(int i=0;i<=last;i++) {
 			System.out.print(s.charAt(i));
				}
	}
	

	private void remove_space2() {
		String s="   how are you?";
		boolean first=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' '&& first==false) {
				
			}
			else {
				first=true;
				System.out.print(s.charAt(i));
			}
		}
		
	}

	private void remove_space1() {
		String s="   parthiban";
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			System.out.print(s.charAt(i));
		}
		}
	}

	private void remove_space() {
		String s="   parthiban";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

	private void pre_defined_method() {
		String s = "parthiban mani";
	      String[] st = s.split(" ");
	      for(int i=0; i<st.length;i++)
	      {
	        String name = st[i];
	        System.out.print((char)(name.charAt(0)-32));
	        String name2 = name.substring(1, name.length()-1);
	        System.out.print(name2);
	        System.out.println((char)(name.charAt(name.length()-1)-32));
	      }
		
	}

	private void name_string2() {
		String s = "parthiban mani";
    for(int i=0;i< s.length();i++)   {
    char ch = s.charAt(i);
    if(i==0||i==s.length()-1)                 {
      if(ch>='a' && ch<='z')
        System.out.print((char)(ch-32));}
    else if(ch==' ')             {
      System.out.print(ch);
      i++; 
      ch = s.charAt(i);
      if(ch>='a' && ch<='z')
        System.out.print((char)(ch-32));}    
    else
    {
      int j = i+1; 
      if(j<s.length() && s.charAt(j)==' ')
      {
        if(ch>='a' && ch<='z')
          System.out.print((char)(ch-32));
      }
      else
        System.out.print(ch);
    }
    }
      
    }

	private void name_string1() {
		String s="parthiban mani";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0) {
				if(ch>='a'&&ch<='z')
					System.out.print((char)(ch-32));}
		else if(ch==' ') {
			System.out.print(ch);
			i++;
			ch=s.charAt(i);
			if(ch>'a'&&ch<='z')
				System.out.print((char)(ch-32));}
		else
			System.out.print(ch);
			
		}
	}
		
	

	private void name_string() {
		String s="parthiban";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0||i==s.length()-1||i==s.length()/2) {
			if(ch>='a'&& ch<='z') 
				System.out.print((char)(ch-32));
			}
			else
				System.out.print(ch);
			
		
		}
		}

	private void String_upper_class() {
		String s="abcd1234";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') 
				System.out.print((char)(ch-32));
				else
					System.out.print(ch);
			}
		}

	private void String_lower_class() {
		String s="ABCD1234";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z') 
				System.out.print((char)(ch+32)); //here print abcd
				else
					System.out.print(ch); //print 1234 
			}
		}
		
	}


