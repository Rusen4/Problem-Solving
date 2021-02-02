package cs300;
import java.util.Scanner;
public class ClockAngle {	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int h1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		h1 = (h1*10)+h2;
		m1 = (m1*10+m2)/5;
		int diff = Math.abs(h1-m1);
		if(h1==12) {
			if(m1==0) {
				System.out.println("0");
				System.exit(0);
			}
		}
		scan.close();
		int angle = diff * 30;
		angle = Math.min(360-angle, angle);
		System.out.println(angle);
	
	}
}
