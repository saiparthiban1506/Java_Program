package Loops;

public class Power_demo {

	public static void main(String[] args) {
		Power_demo mp=new Power_demo();
		int no=1;
		while(no<=5) {
			mp.find_power(no,3);
			no++;
		}
		
		
	}
	void find_power(int base, int power) {
		int no=1;
		while(power>0) {
			no=no*base;
			power--;
			
		}
		System.out.println(no);		
	}
	

	}


