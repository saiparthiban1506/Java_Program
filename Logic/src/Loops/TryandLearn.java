package Loops;

import java.util.Scanner;

public class TryandLearn {

	public static void main(String[] args) {
		TryandLearn pm=new TryandLearn();
//		pm.p();
//		pm.a();
//		pm.r();
//		pm.t();
//		pm.h();
//		pm.i();
//		pm.b();
//		pm.a1();
//		pm.n();
//		pm.tot_avg();
		pm.high_low();

	}
	private void high_low() {
		int[] mp= {69,99,85,38,50};
		int high=0;
		int low=100;
		for(int i=0;i<mp.length;i++) {
			if(mp[i]>high)
				high=mp[i];
			if(mp[i]<low)
				low=mp[i];
		}
		System.out.println(low);
		System.out.println(high);
		
	}
	private void tot_avg() {
		int[] mp=new int[5];
		Scanner sc=new Scanner(System.in);
		int tot=0;
		int avg=0;
		for(int i=0;i<mp.length;i++) {
			System.out.println("enter the number");
			mp[i]=sc.nextInt();
			tot=tot+mp[i];
			avg=tot/mp.length;
		}
		System.out.println(tot);
		System.out.println(avg);
//		int[] mp= {50,50,50,50,50,50};
//		int total=0;
//		int average=0;
//		for(int i = 0; i<mp.length;i++) {
//			total=total+mp[i];
//			average=total/mp.length;
//			
//		}
//		System.out.println(total);
//		System.out.println(average);
		
	}
	private void n() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(col==1||col==row||col==5) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	private void a1() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(col==1||row==1||col==5||row==3) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	private void b() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1||row==5||col==2||col==5||col>=2&&row==3) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	private void i() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==3||row==5) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	private void h() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(col==1||col==5||row==3) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	private void t() {
		int row=1;
		while(row<=5) {
			for(int col=1;col<=5;col++) {
				if(row==1||col==3) 
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
				if(row==1||row==3||col==1||row<=3&&col==5||col==4&&row==4||col==5&&row==5) 
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
				if(col==1||row==1||col==5||row==3) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			row++;
			System.out.println();
		}
		
	}
	void p(){
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


