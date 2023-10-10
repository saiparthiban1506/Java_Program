package Loops;

public class Small_div {
public static void main(String[] args) {
	int no1=100,no2=60;
	int small=no1<no2?no1:no2;
	int div=2;
	while(div<=small) {
		if(no1%div==0&&no2%div==0) {
			System.out.println(div);
		}
	}
	div++;
}
}
