package cs300;
import java.util.Scanner;
import java.util.Arrays;
public class BirthdayCake {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int count = 0;
		Arrays.sort(arr);
		int check = arr[n-1];
		for(int i=0;i<arr.length;i++) {
			if(check==arr[i]) {
				count++;
			}
		}
		System.out.print(count);
	}
}
