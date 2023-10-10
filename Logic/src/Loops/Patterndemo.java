package Loops;

public class Patterndemo {

	public static void main(String[] args) {
		Patterndemo mp=new Patterndemo();   //panding works //Zee,f,e,6,and 9,7,4,G,Q,A,V
//		mp.pa1(); //*
//		mp.pa2(); //t
//		mp.pa3(); //c
//		mp.pa4(); //o
//		mp.pa5();
		mp.pa6(); //d
//		mp.pa7(); //^
//		mp.pa8();
//		mp.pa9();
//		mp.pa10();
//		mp.pa11();
//		mp.pa12();
//		mp.pa13();
//		mp.pa14();
//		mp.pa15();
//		mp.pa16();
//		mp.pa17();
		
	}

	private void pa17() {
		for( int row=1; row<=7;row++) {
			   for(int col=1;col<=7;col++) {
			 if((row<=4&&col==1)||(row>4&&(col==1||col==7))) {
			  System.out.print("* ");
			  }
			 else {
			  System.out.print("  ");
			 }
			   }
			   System.out.println();
			  }

		
	}

	private void pa16() {
		for( int row=1; row<=7;row++) {
			   for(int col=1;col<=7;col++) {
			 if(row==7||row==1||row==4||row<=4&&col==7||row>=4&&col==1) {
			  System.out.print("* ");
			  }
			 else {
			  System.out.print("  ");
			 }
			   }
			   System.out.println();
			  }
		

		
	}

	private void pa15() {
		for( int row=1; row<=7;row++) {
			   for(int col=1;col<=7;col++) {
			 if(row==7||row==1||row==4||row<=4&&col==1||row>4&&col==7) {
			  System.out.print("* ");
			  }
			 else {
			  System.out.print("  ");
			 }
			   }
			   System.out.println();
			  }
		
	}

	private void pa14() { 
		for(int row=1; row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==1||row==7||row==1||row==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		}

	private void pa13() {
		for(int row=1;row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       
		             if(col==row&&col>=4||row+col==8&&row>=4||col==1||col==7) {
		              System.out.print("*");
		             }
		             else {
		              System.out.print(" ");
		             }
		             }
		      System.out.println();
		            }
		
	}

	private void pa12() {
		for(int row=1;row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       
		             if(col==row&&col<4||row+col==8&&row<=4||col==1||col==7) {
		              System.out.print("*");
		             }
		             else {
		              System.out.print(" ");
		             }
		             }
		      System.out.println();
		            }
	}

	private void pa11() {
		for(int row=1;row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       
		             if(col==row||row+col==8||col==1||col==7) {
		              System.out.print("*");
		             }
		             else {
		              System.out.print(" ");
		             }
		             }
		      System.out.println();
		            }
		
	}

	private void pa10() {
		for(int row=1;row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       
		             if((col==row&&col<=4)||row+col==8) {
		              System.out.print("*");
		             }
		             else {
		              System.out.print(" ");
		             }
		             }
		      System.out.println();
		            }
		

	}

	private void pa9() {
		for(int row=1;row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       
		             if(col==row||row+col==8) {
		              System.out.print("*");
		             }
		             else {
		              System.out.print(" ");
		             }
		             }
		      System.out.println();
		            }
		
	}

	private void pa8() {
		for(int row=1;row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       
		             if(col==1||col==7||col==row) {
		              System.out.print("*");
		             }
		             else {
		              System.out.print(" ");
		             }
		             }
		      System.out.println();
		            }
	}

	private void pa7() {
		for(int row=1; row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		    	  if(col==1||col==row) {
		    		  System.out.print("*");
		    	  }
		    	  else {
		    		  System.out.print(" ");
		    	  }
		    	  }System.out.println();
		      }
		
	}

	private void pa6() {
		for(int row=1; row<=7;row++) {
		      for(int col=1;col<=7;col++) {
		       if(row==1||col==1|| row==7 || col==7) {
		        if( row==1 && col==7 || row==7 && col==7) {
		         System.out.print("  ");
		        }
		         
		        else {
		        System.out.print("* ");
		        }
		       }
		       else {
		        System.out.print("  ");
		       }
		      }System.out.println();
		}
		
	}

	private void pa5() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(col==1)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private void pa4() {
		for(int row=1; row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1||col==1||col==7||row==7) {
				System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
			
		}System.out.println();
		}	
		
	}

	private void pa3() {
		for(int row=1; row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1 || col==1 || row==7) {
					if(row==1&&col==1&&row==7&&col==1) {
						System.out.print(" ");
					}
					
					else {
					System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
	}
	

	private void pa2() {
		for(int row=1; row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1) {
					System.out.print("*");
				}
				else {
					if(col!=4) {
						System.out.print(" ");
					}
						else {
							System.out.print("*");
						}
					}
				}
				System.out.println();
	}

		
	}

	private void pa1() {
		for(int row=1; row<=7;row++) {
			for(int col=1;col<=7;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
