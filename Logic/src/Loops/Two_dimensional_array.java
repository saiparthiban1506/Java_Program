package Loops;

import java.util.Scanner;

public class Two_dimensional_array {

	public static void main(String[] args) {
		Two_dimensional_array mp=new Two_dimensional_array();
//		mp.two_demo();
//		mp.two_getval();
//		mp.gagged_array();
//		mp.Arrayadd();//04/09/2023
//		mp.ArrayTotal();//04/09/2023
//		mp.Array_Diagonal_adding();//04/09/2023
		mp.Array_spiral_matrix();
		
		}




	private void Array_spiral_matrix() {//Spiral Matrix: 

		  int[][] a = new int[4][4];
		  
		  int no = 1; 
		  int minRow=0, minCol=0, maxCol=3, maxRow=3; 
		  while(no<=16)
		  {
		  
		  for(int col=minCol; col<=maxCol; col++)
		  {
		    a[minRow][col] = no; no++; 
		  }
		  minRow++;
		  // 5 6 7 
		  for(int row=minRow; row<=maxRow; row++)
		  {
		    a[row][maxCol] = no; no++; 
		  }
		  maxCol--; 
		  
		  //8 9 10
		  for(int col=maxCol; col>=minCol; col--)
		  {
		    a[maxRow][col] = no; no++; 
		  }
		  maxRow--; 
		  
		  // 11 12
		  for(int row=maxRow;row>=minRow; row--)
		  {
		    a[row][minCol] = no; no++; 
		  }
		  minCol++; 
		  }
		  
		  for(int i=0;i<4; i++)
		  {
		    for(int j=0; j<4; j++)
		    {
		      System.out.print(a[i][j]+"\t");
		    }
		    System.out.println("\n");
		  }
		  }




	private void Array_Diagonal_adding() {
		int[][] a= {{3,2,4,},{1,2,3},{1,2,3}};
		int total=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
//				if(row==col)
				if(row+col==2){
					total=total+a[row][col];
					System.out.println(total);
				}
			}
			
		}
		
	}




	private void ArrayTotal() {
		int[][] marks= {{50,60,45,50,69},{69,85,75,32,85}};
		int total=0,row=0;
		while(row<marks.length) {
			for(int col=0;col<marks[row].length;col++) {
				total=total+marks[row][col];
				
			}
			System.out.println(total+" ");
			row++;
			total=0;
			}
		
		}




	private void Arrayadd() { //Adding two array matrix
		int[][] a= {{1,2},{3,4}};
		int[][] b= {{4,3},{2,1}};
		int[][] c= new int[2][2];
		int row=0;
		while(row<2) {
			for(int col=0;col<2;col++) {
				c[row][col]=a[row][col]+b[row][col];
				System.out.print(c[row][col]+" ");
			}
			row++;
			System.out.println();
		}
		
	}




	private void gagged_array() {
		int[][] ar= {{1,2,3,4},{1,2,3,4}};
		for(int row=0;row<2 ;row++) {
			for(int col=0;col<4;col++) {
				System.out.print(ar[row][col]+" ");
				
			}System.out.println();
		}
	}




	private void two_getval() {
		Scanner sc=new Scanner(System.in);
		int[][] player=new int[2][];
		System.out.print(player.length);
		player[0]=new int[4];
		int total=0;
		for(int match=0;match<4;match++) {
		System.out.print("enter score: ");
		player[0][match]=sc.nextInt();
		total+=player[0][match];
		}
		System.out.println(total);
		System.out.println(total/player[0].length);
		player[1]=new int[3];
		int total1=0;
		for(int match=0;match<3;match++) {
		System.out.print("enter score: ");
		player[1][match]=sc.nextInt();
		total1+=player[1][match];
		}
		System.out.println(total1);
		System.out.println(total1/player[1].length);
		
	}




	private void two_demo() {
		int[][] score={{1,2,3,4,5},{6,7,8,9,10}};
		int player=0;
		while(player<2) {
			for(int match=0;match<4;match++) {
				System.out.print(score[player][match]+" ");;
				
			}System.out.println();
			player++;
		
		
	}
	}

}
