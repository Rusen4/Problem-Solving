package cs300;
import java.util.Scanner;
public class EqualizeArray {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			String[] split = input.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			arr[i] = parse;
		}
		int max = 0 , numMax=0;
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>max) {
				max = count;
				numMax = arr[i];
			}
		}
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=numMax) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
		
	}
}
