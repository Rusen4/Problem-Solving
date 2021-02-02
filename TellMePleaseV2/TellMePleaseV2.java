package cs300;
import java.util.Scanner;
public class TellMePleaseV2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		String[] spt = in.split("\\s+");
		scan.close();
		//find largest word
		int cntL = 0 , ind = 0 , cmp = 0 , wordL = 0;
		for(int i=0; i<spt.length; i++) {
			for(int j=0; j<spt[i].length(); j++) {
				char c = spt[i].charAt(j);
				if(((c>='A'&&c<='Z')||(c>='a'&&c<='z')) && 
						c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&
						c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U') {
					++cntL;
				}
			}
			if(cntL >= cmp && cntL!=0) {
				wordL = cntL;
				cmp = cntL;
				ind = i;
			}
			cntL = 0;
		}
		String tmpL = spt[ind];
		String l = "";
		for(int i=0; i<tmpL.length(); i++) {
			char c = tmpL.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
				String tmp = String.valueOf(c);
				l = l + tmp;
			}
		}
		System.out.println("The largest word is \'"+l+"\' with "+wordL+" consonant letters");
		//find smallest word
		int cntS = 0 , wordS = 0; 
		cmp = Integer.MAX_VALUE;
		ind = 0;
		for(int i=0; i<spt.length; i++) {
			for(int j=0; j<spt[i].length(); j++) {
				char c = spt[i].charAt(j);
				if(((c>='A'&&c<='Z')||(c>='a'&&c<='z'))&& 
						c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&
						c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U') {
					++cntS;
				}
			}
			if(cntS <= cmp && cntS!=0) {
				wordS = cntS;
				cmp = cntS;
				ind = i;
			}
			cntS = 0;
		}
		String tmpS = spt[ind];
		String s = "";
		for(int i=0; i<tmpS.length(); i++) {
			char c = tmpS.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
				String tmp = String.valueOf(c);
				s = s + tmp;
			}
		}
		System.out.println("and the smallest word is \'"+s+"\' with "+wordS+" consonant letters");
		
	}
}
