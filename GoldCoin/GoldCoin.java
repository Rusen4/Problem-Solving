package cs300;
import java.util.Scanner;
public class GoldCoin {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] firstLine = scan.nextLine().split("\\s+");
		int length = Integer.parseInt(firstLine[0]);
		int coins = Integer.parseInt(firstLine[1]);
		int parkTimes = Integer.parseInt(firstLine[2]);
		String[] secondLine = scan.nextLine().split("\\s+");
		// Q is numbers of missions
		int Q = Integer.parseInt(secondLine[0]);
		// S is numbers of extra mission
		int S = Integer.parseInt(secondLine[1]);
		int[] extraM = new int[50];
		String thirdLine = scan.nextLine();
		for(int i=0; i<S; i++) {
			String[] split = thirdLine.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			extraM[parse] = parse; 
		}
		String[] normalMission = new String[Q];
		for(int i=0; i<Q; i++) {
			normalMission[i] = scan.nextLine();
		}
		// indexNM is index of normal missions
		int[] indexNM = new int[50];
		// coinNM is coin of each normal missions
		int[] coinNM = new int[50];
		for(int i=0;i<Q;i++) {
			String[] split = normalMission[i].split("\\s+");
			int index = Integer.parseInt(split[0]);
			indexNM[index] = index;
			int coin = Integer.parseInt(split[1]);
			coinNM[index] = coin;
		}
		String lastLine = scan.nextLine();
		int[] drive = new int[parkTimes];
		for(int i=0;i<drive.length;i++) {
			String[] split = lastLine.split("\\s+");
			int parse = Integer.parseInt(split[i]);
			drive[i] = parse;
		}
		scan.close();
		int sumLength = 0;
		for(int i=0; i<drive.length; i++) {
			if(drive[i]>20||sumLength>=length) {
				break;
			}else {
				sumLength += drive[i];
				if(sumLength == indexNM[sumLength]) {
					coins -= 1;
					coins += coinNM[sumLength];
				}else if(sumLength == extraM[sumLength]) {
					coins -= 1;
					coins = coins * 2;
				}
			}
		}
		System.out.println(coins);
 	}
}
