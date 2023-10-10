package Loops;

public class Array_char {

	public static void main(String[] args) {
		Array_char mp=new Array_char();
//		mp.First_Repeated_Character();
//		mp.Find_Repeated_letter();
//		mp.Total_repeated_letter();
//		mp.first_non_repeated_letter();
//		mp.first1_non_repeated_letter();
		mp.count_of_each_char();
	}

	

	private void count_of_each_char() {
		String s="parthiban";
		int big=0;
		char c=' ';
		char[] name=s.toCharArray();
		
		for(int j=0;j<name.length;j++) {
			int count=1;
			char ch=name[j];
			if(ch=='_') {
				continue;
			}
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='_';
					count++;
				}
			}
				if(count>big) {
					c=ch;
					big=count;
				}
				System.out.println("count of "+ch+" is "+count);
		}
		
		System.out.println("most frequent letter is "+c);
		System.out.println("most frequent letter appers "+big+" times");
		
	}



	private void first1_non_repeated_letter() {
		char[] name={'a','n','a','n','d','h','d'};
		
		for(int j=0;j<name.length;j++) {
			boolean repeated=false;
			char ch=name[j];
			if(ch=='_') {
				continue;
			}
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='_';
					repeated=true;
//					break;
				}
			}
			if(repeated==false) {
//				j=name.length;
				System.out.println("first non repeated letter "+ch);
				break;
			}
		}
		
	}



	private void first_non_repeated_letter() {
		
		char[] name= {'v','i','j','a','y'};
		boolean repeated=false;
		char ch=name[0];
		for(int i=1;i<name.length;i++) {
			if(ch==name[i]) {
				repeated=true;
				break;
		
			}
	}
if(repeated==false) {
	System.out.println("first non repeated char "+ch);
}
		
	}



	private void Total_repeated_letter() {
		char[] name={'p','a','r','t','t','i','b','a','n'};
		
		  int j=0;
		  while(j<name.length-1) {
		  char ch=name[j];
		  for(int i=j+1;i<name.length;i++) {
		   if(ch==name[i]) {
		    System.out.println("first repeated letter "+ch);
		    break;
		   }
		  }
		  j++;
		  }
		
	}

	private void Find_Repeated_letter() {
//		char[] name={'p','a','r','t','h','i','b','a','n'};
		char[] name= {'r','a','m'};
		int j=0;
		int count=0;
		while(j<name.length-1) {
		char ch=name[j];
		for(int i=j+1;i<name.length;i++) {
			if(ch==name[i]) {
				System.out.println("first repeated letter "+ch);
				count++;
				break;	
				
			}	
		}
		if(count==1)		
			break;
		j++;
		
		}
		if(count==0)
			System.out.println("No Repeated Letter");
		
	}

	private void First_Repeated_Character() {
		char[] name= {'a','n','a','n','d','h'};
		char ch=name[0];
		for(int i=1;i<name.length;i++) {
			if(ch==name[i]) {
				System.out.println("first repeated letter "+ch);
				break;
			}
		}
		
	}

}
