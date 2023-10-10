package Loops;

public class Gcd {
	private void find_gcd(int no1,int no2) {
int div=2;
int gcd=0;
int small=no1<no2?no1:no2;
while(div<=small) {
	if(no1%div==0&&no2%div==0) {
		gcd=div;
	}
	div++;
}
if(gcd!=0) {
	System.out.println("gcd is "+gcd);
}else {
System.out.println("there is no common divisor found");
}
	}

	public static void main(String[] args) {
	Gcd mp=new Gcd();
	mp.find_gcd(13,19);

	}

}
