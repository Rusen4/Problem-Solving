package cs300;
import java.util.Scanner;
import java.util.Arrays;
public class CutTheSticks {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println(arr.length);
		Arrays.sort(arr);
		int min = arr[0];
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(min == arr[i]) {
				++count;
			}else {
				min = arr[i];
				int out = arr.length - count;
				if(out!=0) {
					System.out.println(out);
				}
				++count;
			}
		}
		scan.close();
	}
}
