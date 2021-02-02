package cs300;
import java.util.Scanner;
public class BitBase58 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int output = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='1') {
				output += 0;
			}else if(input.charAt(i)=='2') {
				output += 1;
			}else if(input.charAt(i)=='3') {
				output+=2;
			}else if(input.charAt(i)=='4') {
				output+=3;
			}else if(input.charAt(i)=='5') {
				output+=4;
			}else if(input.charAt(i)=='6') {
				output+=5;
			}else if(input.charAt(i)=='7') {
				output+=6;
			}else if(input.charAt(i)=='8') {
				output+=7;
			}else if(input.charAt(i)=='9') {
				output+=8;
			}else if(input.charAt(i)=='A') {
				output+=9;
			}else if(input.charAt(i)=='B') {
				output+=10;
			}else if(input.charAt(i)=='C') {
				output+=11;
			}else if(input.charAt(i)=='D') {
				output+=12;
			}else if(input.charAt(i)=='E') {
				output+=13;
			}else if(input.charAt(i)=='F') {
				output+=14;
			}else if(input.charAt(i)=='G') {
				output+=15;
			}else if(input.charAt(i)=='H') {
				output+=16;
			}else if(input.charAt(i)=='J') {
				output+=17;
			}else if(input.charAt(i)=='K') {
				output+=18;
			}else if(input.charAt(i)=='L') {
				output+=19;
			}else if(input.charAt(i)=='M') {
				output+=20;
			}else if(input.charAt(i)=='N') {
				output+=21;
			}else if(input.charAt(i)=='P') {
				output+=22;
			}else if(input.charAt(i)=='Q') {
				output+=23;
			}else if(input.charAt(i)=='R') {
				output+=24;
			}else if(input.charAt(i)=='S') {
				output+=25;
			}else if(input.charAt(i)=='T') {
				output+=26;
			}else if(input.charAt(i)=='U') {
				output+=27;
			}else if(input.charAt(i)=='V') {
				output+=28;
			}else if(input.charAt(i)=='W') {
				output+=29;
			}else if(input.charAt(i)=='X') {
				output+=30;
			}else if(input.charAt(i)=='Y') {
				output+=31;
			}else if(input.charAt(i)=='Z') {
				output+=32;
			}else if(input.charAt(i)=='a') {
				output+=33;
			}else if(input.charAt(i)=='b') {
				output+=34;
			}else if(input.charAt(i)=='c') {
				output+=35;
			}else if(input.charAt(i)=='d') {
				output+=36;
			}else if(input.charAt(i)=='e') {
				output+=37;
			}else if(input.charAt(i)=='f') {
				output+=38;
			}else if(input.charAt(i)=='g') {
				output+=39;
			}else if(input.charAt(i)=='h') {
				output+=40;
			}else if(input.charAt(i)=='i') {
				output+=41;
			}else if(input.charAt(i)=='j') {
				output+=42;
			}else if(input.charAt(i)=='k') {
				output+=43;
			}else if(input.charAt(i)=='m') {
				output+=44;
			}else if(input.charAt(i)=='n') {
				output+=45;
			}else if(input.charAt(i)=='o') {
				output+=46;
			}else if(input.charAt(i)=='p') {
				output+=47;
			}else if(input.charAt(i)=='q') {
				output+=48;
			}else if(input.charAt(i)=='r') {
				output+=49;
			}else if(input.charAt(i)=='s') {
				output+=50;
			}else if(input.charAt(i)=='t') {
				output+=51;
			}else if(input.charAt(i)=='u') {
				output+=52;
			}else if(input.charAt(i)=='v') {
				output+=53;
			}else if(input.charAt(i)=='w') {
				output+=54;
			}else if(input.charAt(i)=='x') {
				output+=55;
			}else if(input.charAt(i)=='y') {
				output+=56;
			}else if(input.charAt(i)=='z') {
				output+=57;
			}else {
				output-=1;
			}
		}
		scan.close();
		System.out.println(output);
	}
}
