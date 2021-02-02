package cs300;
import java.util.Scanner;
public class CountingValleys {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		int count = 0,valley = 0;
		for(int i=0; i<n; i++) {
			if(String.valueOf(s.charAt(i)).equals("D")) {
				--count;
			}else if(String.valueOf(s.charAt(i)).equals("U")) {
				++count;
			}
			if(String.valueOf(s.charAt(i)).equals("U")&&count==0) {
				valley++;
			}
		}
		System.out.print(valley);
		scan.close();
	}
}
