package cs300;
import java.util.Scanner;
public class Song {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		int j=1;
		for(int i=0;i<list.length;i++) {
			System.out.print(j++ +" ");
			list[i] = scan.nextInt();
		}
		int[] c = new int[6];
		for(int i=0;i<list.length;i++) {
			if(list[i]==1) {
				c[0]++;
			}else if(list[i]==2) {
				c[1]++;
			}else if(list[i]==3) {
				c[2]++;
			}else if(list[i]==4) {
				c[3]++;
			}else if(list[i]==5) {
				c[4]++;
			}else if(list[i]==6) {
				c[5]++;
			}
		}
		if(c[0]>=c[1]&&c[0]>=c[2]&&c[0]>=c[3]&&c[0]>=c[4]&&c[0]>=c[5]) {
			System.out.println("1");
			if(c[1]>=c[2]&&c[1]>=c[3]&&c[1]>=c[4]&&c[1]>=c[5]) {
				System.out.println("2");
			}else if(c[2]>=c[1]&&c[2]>=c[3]&&c[2]>=c[4]&&c[2]>=c[5]) {
				System.out.println("3");
			}else if(c[3]>=c[1]&&c[3]>=c[2]&&c[3]>=c[4]&&c[3]>=c[5]) {
				System.out.println("4");
			}else if(c[4]>=c[1]&&c[4]>=c[2]&&c[4]>=c[3]&&c[4]>=c[5]) {
				System.out.println("5");
			}else if(c[5]>=c[1]&&c[5]>=c[2]&&c[5]>=c[3]&&c[5]>=c[4]) {
				System.out.println("6");
			}
		}else if(c[1]>=c[0]&&c[1]>=c[2]&&c[1]>=c[3]&&c[1]>=c[4]&&c[1]>=c[5]) {
			System.out.println("2");
			if(c[0]>=c[2]&&c[0]>=c[3]&&c[0]>=c[4]&&c[0]>=c[5]) {
				System.out.println("1");
			}else if(c[2]>=c[0]&&c[2]>=c[3]&&c[2]>=c[4]&&c[2]>=c[5]) {
				System.out.println("3");
			}else if(c[3]>=c[0]&&c[3]>=c[2]&&c[3]>=c[4]&&c[3]>=c[5]) {
				System.out.println("4");
			}else if(c[4]>=c[0]&&c[4]>=c[2]&&c[4]>=c[3]&&c[4]>=c[5]) {
				System.out.println("5");
			}else if(c[5]>=c[0]&&c[5]>=c[2]&&c[5]>=c[3]&&c[5]>=c[4]) {
				System.out.println("6");
			}
		}else if(c[2]>=c[0]&&c[2]>=c[1]&&c[2]>=c[3]&&c[2]>=c[4]&&c[2]>=c[5]) {
			System.out.println("3");
			if(c[0]>=c[1]&&c[0]>=c[3]&&c[0]>=c[4]&&c[0]>=c[5]) {
				System.out.println("1");
			}else if(c[1]>=c[0]&&c[1]>=c[3]&&c[1]>=c[4]&&c[1]>=c[5]) {
				System.out.println("2");
			}else if(c[3]>=c[0]&&c[3]>=c[1]&&c[3]>=c[4]&&c[3]>=c[5]) {
				System.out.println("4");
			}else if(c[4]>=c[0]&&c[4]>=c[1]&&c[4]>=c[3]&&c[4]>=c[5]) {
				System.out.println("5");
			}else if(c[5]>=c[0]&&c[5]>=c[1]&&c[5]>=c[3]&&c[5]>=c[4]) {
				System.out.println("6");
			}
		}else if(c[3]>=c[0]&&c[3]>=c[1]&&c[3]>=c[2]&&c[3]>=c[4]&&c[3]>=c[5]) {
			System.out.println("4");
			if(c[0]>=c[1]&&c[0]>=c[2]&&c[0]>=c[4]&&c[0]>=c[5]) {
				System.out.println("1");
			}else if(c[1]>=c[0]&&c[1]>=c[2]&&c[1]>=c[4]&&c[1]>=c[5]) {
				System.out.println("2");
			}else if(c[2]>=c[0]&&c[2]>=c[1]&&c[2]>=c[3]&&c[2]>=c[5]) {
				System.out.println("3");
			}else if(c[4]>=c[0]&&c[4]>=c[1]&&c[4]>=c[2]&&c[4]>=c[5]) {
				System.out.println("5");
			}else if(c[5]>=c[0]&&c[5]>=c[1]&&c[5]>=c[2]&&c[5]>=c[4]) {
				System.out.println("6");
			}
		}else if(c[4]>=c[0]&&c[4]>=c[1]&&c[4]>=c[2]&&c[4]>=c[3]&&c[4]>=c[5]) {
			System.out.println("5");
			if(c[0]>=c[2]&&c[0]>=c[3]&&c[0]>=c[1]&&c[0]>=c[5]) {
				System.out.println("1");
			}else if(c[1]>=c[0]&&c[1]>=c[2]&&c[1]>=c[3]&&c[1]>=c[5]) {
				System.out.println("2");
			}else if(c[2]>=c[0]&&c[2]>=c[1]&&c[2]>=c[3]&&c[2]>=c[5]) {
				System.out.println("3");
			}else if(c[3]>=c[0]&&c[3]>=c[1]&&c[3]>=c[2]&&c[3]>=c[5]) {
				System.out.println("4");
			}else if(c[5]>=c[0]&&c[5]>=c[1]&&c[5]>=c[2]&&c[5]>=c[3]) {
				System.out.println("6");
			}
		}else if(c[5]>=c[0]&&c[5]>=c[1]&&c[5]>=c[2]&&c[5]>=c[3]&&c[5]>=c[4]) {
			System.out.println("6");
			if(c[0]>=c[2]&&c[0]>=c[3]&&c[0]>=c[1]&&c[0]>=c[4]) {
				System.out.println("1");
			}else if(c[1]>=c[0]&&c[1]>=c[2]&&c[1]>=c[3]&&c[1]>=c[4]) {
				System.out.println("2");
			}else if(c[2]>=c[0]&&c[2]>=c[1]&&c[2]>=c[3]&&c[2]>=c[4]) {
				System.out.println("3");
			}else if(c[3]>=c[0]&&c[3]>=c[1]&&c[3]>=c[2]&&c[3]>=c[4]) {
				System.out.println("4");
			}else if(c[4]>=c[0]&&c[4]>=c[1]&&c[4]>=c[2]&&c[4]>=c[3]) {
				System.out.println("5");
			}
		}
		scan.close();
	}
}
