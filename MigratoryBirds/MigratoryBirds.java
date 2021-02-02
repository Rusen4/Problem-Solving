package cs300;
import java.util.Scanner;
import java.util.Arrays;
public class MigratoryBirds {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[5];
		for(int i=0; i<n; i++) {
			switch(scan.nextInt()) {
			case 1 : 
				arr[0]++;
				break;
			case 2 : 
				arr[1]++; 
				break;
			case 3 : 
				arr[2]++; 
				break;
			case 4 : 
				arr[3]++; 
				break;
			case 5 : 
				arr[4]++; 
				break;
			}
		}
		int[] check = new int[n];
		for(int i=0;i<arr.length;i++) {
			check[i] = arr[i];
		}
		Arrays.sort(check);
		int high = check[check.length-1];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==high) {
				System.out.println(i+1);
				break;
			}
		}
		scan.close();
	}
}
