package cs300;
import java.util.Scanner;
public class PopularVote {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String[] tmp1 = input1.split(" ");
		int n = Integer.parseInt(tmp1[0]);
		int k = Integer.parseInt(tmp1[1]);
		String input2 = scan.nextLine();
		String[] tmp2 = input2.split(" ");
		int u = n-k;
		long[] list1 = new long[k];
		long[] list2 = new long[u];
		scan.close();
		for(int i=0;i<k;i++) {
			list1[i] = Long.parseLong(tmp2[i]);
		}
		for(int i=k,j=0;i<n;i++,j++) {
			list2[j] = Long.parseLong(tmp2[i]);
		}
		long sum1 = 0;
		for(int i=list1.length-1,j=0;i>=0;j++,i--) {
			sum1 += list1[i]*Math.pow(2.0, (double)j);
		}
		long  sum2 = 0;
		for(int i=list2.length-1,j=0;i>=0;j++,i--) {
			sum2 += list2[i]*Math.pow(2.0,(double)j);
		}
		int check = 0;
		if(sum1==sum2) {
			check=0;
		}else if(sum1>sum2) {
			check = 1;
		}else if(sum1<sum2) {
			check = 2;
		}
		for(int i=0;i<list1.length;i++) {
			System.out.print(list1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<list2.length;i++) {
			System.out.print(list2[i]+" ");
		}
		System.out.println();
		System.out.println(check);
	}
}
