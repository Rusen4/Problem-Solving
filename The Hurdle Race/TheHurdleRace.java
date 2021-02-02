package cs300;
import java.util.Scanner;
public class TheHurdleRace {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] nk = scan.nextLine().split("\\s+");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int high = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>high) {
				high = arr[i];
			}
		}
		if(k>high) {
			high = 0;
			System.out.println(high);
		}else {
			System.out.println(high-k);
		}
		scan.close();
 	}
}
