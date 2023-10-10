package Loops;

public class Recursion {

	public static void main(String[] args) {
		int result=fact(4);
		System.out.println(result);
		int total=0;
		int result1=addition_n_number(5,total);
	}

	private static int addition_n_number(int no, int total) {
		total=total+no;
		no--;
		if(no>=1)
			addition_n_number(no);
		else
		return total;
		return total;
	}

	private static void addition_n_number(int no) {
		// TODO Auto-generated method stub
		
	}

	private static int fact(int no) {
		
		if(no==1) 
			return no;
		else
			return no*fact(no-1);
		}
		
			


}
