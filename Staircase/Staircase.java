package cs300;
import java.util.Scanner;
public class Staircase {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i = 1; i<=n ; i++) {
			for(int j = 1 ;j<=n-i;j++) {
				System.out.print(" ");
			}
			int r = i;
			while(r>0) {
				System.out.print('#');
				r--;
			}
			System.out.println();
		}
	}
}
