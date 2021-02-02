package cs300;
import java.util.Scanner;
public class Appointment {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int bh1 = scan.nextInt();
		int bm1 = scan.nextInt();
		int eh1 = scan.nextInt();
		int em1 = scan.nextInt();
		
		int bh2 = scan.nextInt();
		int bm2 = scan.nextInt();
		int eh2 = scan.nextInt();
		int em2 = scan.nextInt();
		scan.close();
		
		if(bh1 == bh2) {
			if(bm1 == bm2 && eh1 == eh2 && em1 == em2) { //perfect same
				System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
			}else if(bm1 == bm2 ) {
				if(eh1 == eh2) {
					if(em1<em2) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
					}else if(em2 < em1) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em2);
					}
				}
				else if(eh1 < eh2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
				}else if(eh1 > eh2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh2,em2);
				}
			}else if(bm1 < bm2) {
				if(eh1 < eh2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm2,eh1,em1);
				}else if(eh1 > eh2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm2,eh2,em2);
				}else if(eh1 == eh2) {
					if(em1 == em2) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm2,eh1,em1);
					}else if(em1 < em2) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm2,eh1,em1);
					}else if(em2 < em1) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm2,eh1,em2);
					}
				}
			}else if(bm1 > bm2) {
				if(eh1 < eh2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
				}else if(eh1 > eh2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh2,em2);
				}else if(eh1 == eh2) {
					if(em1 == em2) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
					}else if(em1 < em2) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
					}else if(em1 > em2) {
						System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em2);
					}
				}
			}
		}else if(bh1 < bh2) {
			if(eh1 <= bh2) {
				System.out.println("0 0 0 0");
			}else if(eh1 == eh2) {
				if(em1 < em2) {
					System.out.printf("%02d %02d %02d %02d",bh2,bm2,eh1,em1);
				}else if(em1 > em2) {
					System.out.printf("%02d %02d %02d %02d",bh2,bm2,eh1,em2);
				}else if(em1 == em2) {
					System.out.printf("%02d %02d %02d %02d",bh2,bm2,eh1,em1);
				}
			}else if(eh1 < eh2) {
				System.out.printf("%02d %02d %02d %02d",bh2,bm2,eh1,em1);
			}else if(eh1 > eh2) {
				System.out.printf("%02d %02d %02d %02d",bh2,bm2,eh2,em2);
			}
		}else if(bh1 > bh2) {
			if(eh2 <= bh1) {
				System.out.println("0 0 0 0");
			}else if(eh1 == eh2) {
				if(em1 < em2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
				}else if(em1 > em2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em2);
				}else if(em1 == em2) {
					System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
				}
			}else if(eh1 < eh2) {
				System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh1,em1);
			}else if(eh1 > eh2) {
				System.out.printf("%02d %02d %02d %02d",bh1,bm1,eh2,em2);
			}
		}
		
	}
}
