package cs300;
import java.util.Scanner;
public class DiagonalDifference {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr.length;c++) {
				arr[r][c] = scan.nextInt();
			}
		}
		scan.close();
		int sumLeft = 0 , sumRight = 0;
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr.length;c++) {
				if(r==c) {
					sumLeft += arr[r][c];
				}
			}
		}
		for(int r=n-1;r>0;r--) {
			for(int c=0;c<arr.length;c++) {
				sumRight += arr[r][c];
				r--;
			}
		}
		int difference = Math.abs(sumLeft-sumRight);
		System.out.println(difference);
	}
}
