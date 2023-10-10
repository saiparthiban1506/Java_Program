package Loops;

import java.util.Scanner;

public class Arrays_demo {
public static void main(String[] args) {
//	System.out.println(args.length);
	Arrays_demo mp=new Arrays_demo();
//	mp.learning1(); //total and average
//	mp.learning2(); //highest and lowest
//	mp.learning3(); //count of 100
	mp.learning4(); //highest and second highest
//	mp.learning5(); //lowest and second lowest
//	mp.learning6(); //negative numbers, negative numbers/20,negative number=even position,count of negative numbers
}

private void learning6() {
	int[] ar= {5,-10,-20,30,-40,50};
	int count=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]<0) { //negative number print
//			System.out.println(ar[i]);
		}
		if(ar[i]<0&&ar[i]%20==0) {  //negative numbers/20
//			System.out.println(ar[i]);
		}
		if(ar[i]<0) { //count of negative numbers
			count++;
		}	
		if(ar[i]<0&&i%2==0) { //negative number in even position
			System.out.println(ar[i]);
		}
		
	}
//	System.out.println(count);	
	
}

private void learning5() {
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	int[] scores= {69,99,100,85,45};
	int lowest=Integer.MAX_VALUE,second_lowest=Integer.MAX_VALUE;
	for(int i =0;i<scores.length;i++) {
		if(scores[i]<lowest) {
			second_lowest=lowest;
			lowest=scores[i];
		}
		else if(scores[i]<second_lowest){
			second_lowest=scores[i];
		}
		
	}System.out.println(lowest);
	System.out.println(second_lowest);

	
}

private void learning4() {
	int[] scores= {69,85,99,100,36};
	int h=scores[0],s=scores[0];
	for(int i =1;i<scores.length;i++) {
		if(scores[i]>h) {
			s=h;
			h=scores[i];
		}
		else if(scores[i]>s){
			s=scores[i];
		}
		
	}System.out.println(h);
	System.out.println(s);
}

private void learning3() {
	int[] marks= {100,50,97,85,69,100};
	int count =0;
	for(int i=0;i<marks.length;i++) {
		if(marks[i]==100)
//			System.out.println(marks[i]); 
		if(marks[i]>96)
			count++;
	}
	System.out.println(count);
	
}

private void learning2() {
	int[] marks= {25,35,100,31,45};
	int high=0;
	int low=100;
	int count=0;
	for(int i=0;i<marks.length;i++) {
		if(marks[i]>high)
			high=marks[i];
		if(marks[i]<low)
			low=marks[i];
	}
	System.out.println(high);
	System.out.println(low);
	
	
}

private void learning1() {
	int[] marks=new int[5];
	Scanner sc=new Scanner(System.in);
	int total=0;
	int avg=0;
	for(int i=0;i<marks.length;i++) {
	System.out.println("Enter the Marks");
//	System.out.println(marks[i]);
	marks[i]=sc.nextInt();
	total=total+marks[i];
	avg=total/marks.length;
}
	System.out.println(total);
	System.out.println(avg);
sc.close();	
//	for(int i=0;i<marks.length;i++)
//	System.out.println(marks[i]);
	
}
}
