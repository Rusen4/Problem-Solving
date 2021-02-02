package cs300;
import java.util.Scanner;
public class Binary {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int dec = scan.nextInt();
		scan.close();
		int sum = 0 , p = 0;
		for(int i=arr.length-1; i>=0; i--) {
			int tmp = (int)Math.pow(2, p) * 1;
			p++;
			sum += tmp;
		}
		String out = Integer.toBinaryString(sum*dec);
		for(int i=0; i<out.length(); i++) {
			System.out.println(out.charAt(i));
		}
		
	}
}
