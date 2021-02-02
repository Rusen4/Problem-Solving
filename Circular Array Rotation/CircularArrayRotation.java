package cs300;
import java.util.Scanner;
public class CircularArrayRotation {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int[] arrQ = new int[q];
		for(int i=0; i<q; i++) {
			int m = scan.nextInt();
			arrQ[i] = arr[(n-(k%n)+m)%n];
		}
		for(int i=0; i<arrQ.length; i++) {
			System.out.println(arrQ[i]);
		}
 		scan.close();
	}
}
