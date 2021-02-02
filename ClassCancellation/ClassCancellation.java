package cs300;
import java.util.Scanner;
public class ClassCancellation {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] ntk = scan.nextLine().split("\\s+");
		int n = Integer.parseInt(ntk[0]);
		int k = Integer.parseInt(ntk[1]);
		int t = Integer.parseInt(ntk[2]);
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int stud = (k*n)/100;
		int late = 0,count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<=t) {
				count++;
			}
			if(arr[i]>t) {
				late++;
			}
		}
		if(count>=stud) {
			System.out.println("1");
			System.out.println(late);
		}else {
			System.out.println("0");
			System.out.println(late);
		}
		scan.close();
		
	}
}
