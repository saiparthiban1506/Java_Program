package Loops;

public class Pattern {

	public static void main(String[] args) {
		int col=5;
		for(int row=1;row<=col;row++) {
			for(int row1=col;row1>=row;row1--) {
				System.out.print(" ");
			}
				for(int row2=1;row2<=row;row2++) {
					System.out.print("*");
				}
				System.out.println();
				
				
			}
			
		}
		

	}


