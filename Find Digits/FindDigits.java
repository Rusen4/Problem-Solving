package cs300;
import java.util.Scanner;
public class FindDigits {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		String[] s = new String[t];
		for(int i=0; i<t; i++) {
			s[i] = scan.nextLine();
		}
		int[] count = new int[t];
		for(int i=0; i<s.length; i++) {
			int divide = Integer.parseInt(s[i]);
			for(int j=0; j<s[i].length(); j++) {
				if(String.valueOf(s[i].charAt(j)).equals("0")) {
					continue;
				}
				int divisor = Integer.parseInt(String.valueOf(s[i].charAt(j)));
				if(divide%divisor==0) {
					count[i]++;
				}
			}
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
		scan.close();
	}
}
