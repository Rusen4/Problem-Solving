package cs300;
import java.util.Scanner;
public class UtopianTree {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int day = 0;
			int height = 1;
			if(arr[i]==0) {
				result[i] = height;
				continue;
			}
			while(day < arr[i]) {
				if(day%2==0) {
					height += height;
				}else {
					height += 1;
				}
				result[i] = height;
				day++;
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
