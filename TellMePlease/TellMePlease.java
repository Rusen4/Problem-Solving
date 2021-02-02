package cs300;
import java.util.Scanner;
public class TellMePlease {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String large = largest(in);
		String small = smallest(in);
		scan.close();
		String lg = "";
		for(int i=0; i<large.length(); i++) {
			char c = large.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
				String tmp = String.valueOf(c);
				lg = lg + tmp;
			}
		}
		System.out.println("The largest word is \'"+lg+"\'");
		
		String sm = "";
		for(int i=0; i<small.length(); i++) {
			char c = small.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
				String tmp = String.valueOf(c);
				sm = sm + tmp;
			}
		}
		System.out.println("and the smallest word is \'"+sm+"\'");
	}
	private static String largest(String in) {
		String[] spt = in.split("\\s+");
		int cnt = 0 , ind = 0 , cmp = 0;
		for(int i=0; i<spt.length; i++) {
			for(int j=0; j<spt[i].length(); j++) {
				char c = spt[i].charAt(j);
				if((c>='A' && c<='Z') || (c>='a'&& c<='z')) {
					++cnt;
				}
			}
			if(cnt > cmp && cnt!=0) {
				cmp = cnt;
				ind = i;
			}
			cnt = 0;
		}
		String ret = spt[ind];
		return ret;
	}
	
	private static String smallest(String in) {
		String[] spt = in.split("\\s+");
		int cnt = 0, ind = 0 , cmp = Integer.MAX_VALUE;
		for(int i=0 ;i<spt.length; i++) {
			for(int j=0; j<spt[i].length(); j++) {
				char c = spt[i].charAt(j);
				if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
					++cnt;
				}
			}
			if(cnt<cmp&&cnt!=0) {
				cmp = cnt;
				ind = i;
			}
			cnt = 0;
		}
		String ret = spt[ind];
		return ret;
	}
}
	
	
