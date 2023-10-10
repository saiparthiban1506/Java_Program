package Loops;

public class Binary_search {

	public static void main(String[] args) {
		Binary_search mp=new Binary_search();
//		mp.method1();
		mp.method2();
		}



	private void method2() {
	int[] ar= {1,2,3,4,5};
	int key=2, min=0,max=ar.length-1;
	
	while(true) {
		int mid=(min+max)/2;
		if(key==ar[mid]) {
			System.out.println("key is present at "+mid+" Position"); break;
			
		}
		else if(min>max) {
			System.out.println("key is not Present"); break;
		}
		else if(key>ar[mid]) {
			min=mid+1;
		}
		else {
			max=mid-1;
		}
		
	}
		
	}



	private void method1() {
		int[] ar= {1,2,3,4,5};
		int key=3, min=0,max=ar.length-1;
		int mid=(min+max)/2;
		if(key==ar[mid]) {
			System.out.println("key is present at "+mid+" position");
		
		
	}

}
}