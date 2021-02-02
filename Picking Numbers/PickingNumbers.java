package cs300;
import java.util.Scanner;
public class PickingNumbers {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		scan.nextLine();
		String input = scan.nextLine();
		for(int i=0; i<n; i++) {
			String[] split = input.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			arr[i] = parse;
		}
		int[] freq = new int[101];
		for(int i=0; i<arr.length; i++) {
			freq[arr[i]]++;
		}
		int max = 0;
		for(int i=1; i<freq.length; i++) {
			int check = freq[i] + freq[i-1];
			if(check>max) {
				max = check;
			}
		}
		System.out.print(max);
		scan.close();
		
	}
}
