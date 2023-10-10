package Loops;

public class Binary_deci {
	public static void main(String[] args) {
		Binary_deci mp=new Binary_deci();
		mp.find_reverse(1111);
		
		
	}
	void find_reverse(int binary) {
		int p=0;
		int decimal=0;
		while(binary>0) {
			int rem=binary%10;
			int result=rem*find_pow(2,p);
			p++;
			decimal=decimal+result;
			//System.out.print(result+" ");
			binary=binary/10;
			
		}
		System.out.println(decimal);
	}
		private int find_pow(int base,int power) {
			int no=1;
			while(power>0) {
				no=no*base;
				power--;				
		}
//			System.out.print(no+" ");
			return no;
	}
}
