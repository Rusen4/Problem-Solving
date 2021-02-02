package cs300;
import java.util.Scanner;
public class Hoodoos {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int count = 0 , high = 0;
		for(int i=0; i<arr.length-2; i++) {
			int edge = arr[i];
			int tmp = 0;
			int ind = i + 1;
			if(arr[i]==0||arr[i+1]<edge) {
				continue;
			}
			if(arr[ind]>edge&&arr[ind+1]==edge) {
				tmp = arr[ind];
				count++;
			}
			if(arr[ind]>=edge&&arr[ind]==arr[ind+1]) {
				for(int j=ind; j<arr.length-2; j++) {
					if(arr[j]==arr[j-1]&&arr[j+1]==edge) {
						tmp = arr[ind];
						count++;
						break;
					}
				}
			}
			if(tmp>high) {
				high = tmp;
			}
		}
		System.out.println(count);
		System.out.println(high);
		scan.close();
	}
}
