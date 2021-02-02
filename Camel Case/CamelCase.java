package cs300;
import java.util.Scanner;
public class CamelCase {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		int count = 0 ;
		for(int i=0; i<in.length(); i++) {
			if(String.valueOf(in.charAt(i)).equals(
					String.valueOf(in.charAt(i)).toLowerCase())) {
				count++;
				break;
			}
		}
		for(int i=0; i<in.length(); i++) {
			if(String.valueOf(in.charAt(i)).equals(
					String.valueOf(in.charAt(i)).toUpperCase())) {
				count++;
			}
		}
		System.out.print(count);
		scan.close();
	}
}
