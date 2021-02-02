package cs300;
import java.util.Scanner;
public class BugCatcher {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = 0,b=0,c=0,d=0,e=0;
		String input = scan.nextLine();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='A'||input.charAt(i)=='a') {
				a++;
			}else if(input.charAt(i)=='B'||input.charAt(i)=='b') {
				b++;
			}else if(input.charAt(i)=='C'||input.charAt(i)=='c') {
				c++;
			}else if(input.charAt(i)=='D'||input.charAt(i)=='d') {
				d++;
			}else if(input.charAt(i)=='E'||input.charAt(i)=='e') {
				e++;
			}
		}
		System.out.print(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n");
		if(a>b&&a>c&&a>d&&a>e) {
			System.out.println("A");
		}else if(b>a&&b>c&&b>d&&b>e) {
			System.out.println("B");
		}else if(c>a&&c>b&&c>d&&c>e) {
			System.out.println("C");
		}else if(d>a&&d>b&&d>c&&d>e) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		scan.close();
	}
}
