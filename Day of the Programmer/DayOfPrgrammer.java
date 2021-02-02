package cs300;
import java.util.Scanner;
public class DayOfPrgrammer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		if(year==1918) {
			System.out.print("26.09."+year);
		}
		else if((year<=1917)&&(year%4==0)||(year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.print("12.09."+year);
		}else {
			System.out.print("13.09."+year);
		}
	}
}
