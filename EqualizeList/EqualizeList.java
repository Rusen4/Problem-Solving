package cs300;
import java.util.Scanner;
public class EqualizeList {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String inputs = scan.nextLine();
		scan.close();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			String[] split = inputs.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			arr[i] = parse;
		}
		int remain = 0;
		int max = 0;
		for(int i=arr.length-1 ;i>=0; i--) {
			int count = 0;
			for(int j=0 ;j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					++count;
				}
			}
			if(count>=max) {
				max =  count;
				remain = arr[i];
			}
		}
		System.out.println(remain);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=remain) {
				System.out.println(arr[i]);
			}
		}
	}
}
