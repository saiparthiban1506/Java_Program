package Loops;

public class sub_array {

	public static void main(String[] args) {
		int[] a= {20,30,0,10};
		   int[] b= {0,10};
		   int count=0;
		   for(int j=0;j<b.length;j++) {
		    boolean present=false;
		    for(int i=0;i<a.length;i++) {
		     if(b[j]==a[i]) {
		      count++;
		      present=true;
		     }
		    }
		    if(present==false) {
		     System.out.println("NOT SUB ARRAY");
		     break;
		    }
		    if(count==b.length) {
		     System.out.println("B IS SUB ARRAY OF A");}
		    }		}

	}


