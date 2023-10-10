package Loops;

public class Pattern_test {

	public static void main(String[] args) {
		 Pattern_test mp=new Pattern_test();
//		 mp.p();
//		 mp.a();
//		 mp.r();
//		 mp.di();
		 mp.hr();
		 

	}
	
	private void hr() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1&&col==2||row==1&&col==4||row==2&&col==1||row==2&&col==3||row==2&&col==5||row==3&&col==2||row==3&&col==4||row==4&&col==3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}

	}
	private void di() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1&&col==3||row==2&&col==2||row==2&&col==4||row==3&&col==1||row==3&&col==5||row==4&&col==2||row==4&col==4||row==5&&col==3)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	private void r() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==3||col==1||row<=3&&col==5||row==4&&col==4||row==5&col==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}

		
	}
	private void a() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==3||col==1||row<=5&&col==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}

	private void p() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==3||col==1||row<=3&&col==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}

	

}
