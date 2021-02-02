package cs300;
import java.util.Scanner;
public class AppleOrange {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] st = scan.nextLine().split("\\s+");
		int s = Integer.valueOf(st[0]);
		int t = Integer.valueOf(st[1]);
		String[] ab = scan.nextLine().split("\\s+");
		int a = Integer.valueOf(ab[0]);
		int b = Integer.valueOf(ab[1]);
		String[] mn = scan.nextLine().split("\\s+");
		int m = Integer.valueOf(mn[0]);
		int n = Integer.valueOf(mn[1]);
		int[] apple = new int[m];
		int[] orange = new int[n];
		for(int i=0;i<m;i++) {
			apple[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			orange[i] = scan.nextInt();
		}
		scan.close();
		int countApple=0 , countOrange=0;
		for(int i=0;i<apple.length;i++) {
			int tmp = a;
			tmp += apple[i];
			if(tmp>=s&&tmp<=t) {
				countApple++;
			}
		}
		for(int i=0;i<orange.length;i++) {
			int tmp = b;
			tmp += orange[i];
			if(tmp>=s&&tmp<=t) {
				countOrange++;
			}
		}
		System.out.printf("%d\n%d",countApple,countOrange);
	}
}
