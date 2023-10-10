package Loops;

public class Fibonacci_learn {

	public static void main(String[] args) {
		Fibonacci_learn fibo=new Fibonacci_learn();
		fibo.print_fibo(0,1);
		
	}

	 void print_fibo(int first, int second) {
		int count=1;
		while(count<=10) { //first 10 fibonacci number
			System.out.print(first+" ");
		//int third=second+first; //without 3rd variable
		first=second+first;
		second=first-second;
		count++;
		
		}
		
	}
	

}
