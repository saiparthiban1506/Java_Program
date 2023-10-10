package Loops;

public class Prime_learn { //first 20 prime number
	public static void main(String[] args) {
		Prime_learn p1=new Prime_learn();
		p1.find_prime(2);

	}
	void find_prime(int no) {
		int div=2,prime_count=0,count=0;
		while(div<=no/2) {
			if(no%div==0) {
				count++;
				break;
			}
			div++;
			prime_count=prime_count+1;
			}
		if(count==0) {
			System.out.println(no+"Prime");;
			
		}
		if(prime_count<=5) {
			no++;
			find_prime(no);
		}
	}

}
