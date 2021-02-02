package cs300;
import java.util.Scanner;
public class AngryProfessor {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		int[] k = new int[t];
		int[] count = new int[t];
		for(int tItr = 0; tItr < t ; tItr++) {
			String[] nk = scan.nextLine().split("\\s+");
			int n = Integer.parseInt(nk[0]);
			k[tItr] = Integer.parseInt(nk[1]);
			int[] a = new int[n];
			String[] aItems = scan.nextLine().split("\\s+");
			for(int i=0; i<n ;i++) {
				int aItem = Integer.parseInt(aItems[i]);
				a[i] = aItem;
			}
			int countStud = 0;
			for(int i=0; i<a.length; i++) {
				if(a[i]<=0) {
					++countStud;
				}
			}
			count[tItr] = countStud;
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>=k[i]) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		scan.close();
	}
}
