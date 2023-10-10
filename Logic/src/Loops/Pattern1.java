package Loops;

public class Pattern1 {

	public static void main(String[] args) {
		Pattern1 mp=new Pattern1();
//		mp.pattern();
//		mp.pat1();
//		mp.pat2();
//		mp.pat3();
		mp.pat4();

	}
	void pattern() {
	for(int row=1;row<=5;row++) {
		for(int col=1;col<row;col++) {
			System.out.print("*");
		}
		for(int no=1;no<=3;no++) {
			System.out.print(1);
		}
		System.out.println();
	}
	}
	void pat1() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("*");
			}
			for(int no=1;no<=6-row;no++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
	void pat2() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("*");
			}
			for(int no=1;no<=row;no++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
	void pat3() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print(" ");
			}
			for(int no=5;no>=row;no--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void pat4() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=6-row;col++) {
				System.out.print("*"+" ");
			}
			for(int no=5;no<=row;no++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
}
