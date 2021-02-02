package cs300;
import java.util.Scanner;
public class CardVerification {
	public static void main(String args[]) {
		String temp;
		Scanner scan = new Scanner(System.in);
		temp = scan.nextLine();
		int size1 = (int)Math.round(temp.length()/2.0);//size of list1
		int size2 = (int)Math.floor(temp.length()/2.0);//size of list2
		//list of digit after digit that start from  last digit
		int [] list1 = new int[size1];
		//list of digit after digit that start from second last digit
		int [] list2 = new int[size2];
		scan.close();
		for(int j=0,i=temp.length()-1;i>=0; i=i-2,j++) {
			list1[j] = Integer.parseInt(String.valueOf(temp.charAt(i)));
		}
		for(int j=0,i=temp.length()-2;i>=0;i=i-2,j++) {
			list2[j] = Integer.parseInt(String.valueOf(temp.charAt(i)));
		}
		int sumOflist1 = 0;
		for(int i=0;i<list1.length;i++) {
			sumOflist1 += list1[i];
		}
		for(int i=0;i<list2.length;i++) {
			list2[i] = list2[i] *2;
		}
		int sumOflist2 = 0;
		for(int i=0;i<list2.length;i++) {
			sumOflist2 += list2[i] / 10;
			sumOflist2 += list2[i] % 10;
		}
		String check1,check2;
		check1 = temp.charAt(0)+""+temp.charAt(1); 
		check2 = ""+temp.charAt(0);
		int checkSum = sumOflist1 + sumOflist2;
		checkSum = checkSum % 10;
		if(check1.equals("34")||check1.equals("37")) {
			if(checkSum==0) {
				System.out.println(checkSum);
				System.out.println("AMEX");
			}else {
				System.out.println(checkSum);
				System.out.println("INVALID");
			}
		}else if(check2.equals("2")||check1.equals("51")||check1.equals("52")
			||check1.equals("53")||check1.equals("54")||check1.equals("55")) {
			if(checkSum==0){
				System.out.println(checkSum);
				System.out.println("MASTERCARD");
			}else {
				System.out.println(checkSum);
				System.out.println("INVALID");
			}
		}else if(check2.equals("4")) {
			if(checkSum==0) {
				System.out.println(checkSum);
				System.out.println("VISA");
			}else {
				System.out.println(checkSum);
				System.out.println("INVALID");
			}
		}else if(check2.equals("6")) {
			if(checkSum==0) {
				System.out.println(checkSum);
				System.out.println("DISCOVER");
			}else {
				System.out.println(checkSum);
				System.out.println("INVALID");
			}
		}else {
			if(checkSum==0) {
				System.out.println(checkSum);
				System.out.println("OTHERS");
			}else {
				System.out.println(checkSum);
				System.out.println("INVALID");
			}
		}
	}
}
