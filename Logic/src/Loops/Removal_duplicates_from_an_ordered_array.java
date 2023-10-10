package Loops;

public class Removal_duplicates_from_an_ordered_array {

	public static void main(String[] args) {
		int[] ar= {10,20,20,30,40,50,60};
		int unique=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]!=ar[i+1]) {
				ar[unique]=ar[i+1];
				unique++;
				
			}
			
			
		}
		for(int i=0;i<unique;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
