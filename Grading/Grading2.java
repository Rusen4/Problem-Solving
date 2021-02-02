package cs300;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Grading2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		do {
			n = scan.nextInt();
		}while(n<1||n>100);
		scan.nextLine();
		String[] arr = new String[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextLine();
		}
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			String[] split = arr[i].split("\\s+");
			String id = String.valueOf(split[0].charAt(0)) + 
					String.valueOf(split[0].charAt(1));
			String faculty = String.valueOf(split[0].charAt(2)) +
					String.valueOf(split[0].charAt(3));
			int mid = Integer.parseInt(split[1]);
			int fin = Integer.parseInt(split[2]);
			if(id.equals("55")||id.equals("56")||id.equals("57")||id.equals("58")||id.equals("59")||
					id.equals("60")||id.equals("61")) {
				if(faculty.equals("01")||faculty.equals("02")||faculty.equals("03")||faculty.equals("04")
						||faculty.equals("05")||faculty.equals("06")||faculty.equals("07")||faculty.equals("08")) {
					if(mid>=0 && mid<=100) {
						if(fin>=0 && fin<=100) {
							list.add(arr[i]);
						}
					}
				}
			}
 		}
		double mean, sum = 0.0 ;
		for(int i=0; i<list.size(); i++) {
			String[] split = list.get(i).split("\\s+");
			double mid = Double.parseDouble(split[1]);
			double fin = Double.parseDouble(split[2]);
			mid = mid * 0.35;
			fin = fin * 0.65;
			sum += mid + fin;
		}
		if(list.size()==0) {
			System.out.println("0.00");
			System.exit(0);
		}
		mean = sum/list.size();
		ArrayList<String> output = new ArrayList<>();
		ArrayList<Double> listScore = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			String[] split = list.get(i).split("\\s+");
			double mid = Double.parseDouble(split[1]);
			double fin = Double.parseDouble(split[2]);
			mid = mid * 0.35;
			fin = fin * 0.65;
			double score =  mid + fin;
			String grade = "";
			if(mean>=55) {
				if(score - mean > 15) {
					grade = "A";
				}else if(score-mean > 5 && score - mean <=15) {
					grade = "B";
				}else if(score-mean >= 0 && score-mean <=5) {
					grade = "C";
				}else if(mean-score>0 && mean-score <=10) {
					grade = "D";
				}else if(mean-score > 10) {
					grade = "F";
				}
			}else {
				if(score >= 85) {
					grade = "A";
				}else if(score>=70 && score<85) {
					grade = "B";
				}else if(score>=60 && score<70) {
					grade = "C";
				}else if(score>=50 && score<60) {
					grade = "D";
				}else if(score<50) {
					grade = "F";
				}
			}
			String add = split[0] + " " + score +" " + grade;
			output.add(add);
			listScore.add(score);
		}
		Collections.sort(listScore);
		Collections.reverse(listScore);
		System.out.printf("%05.2f\n",mean);
		for(int i=0; i<listScore.size(); i++) {
			for(int j=0; j<output.size(); j++) {
				String[] split = output.get(j).split("\\s+");
				double score = Double.parseDouble(split[1]);
				if(listScore.get(i)==score) {
					System.out.println(split[0]+" "+String.format("%05.2f", score)
					+" "+split[2]);
					output.remove(j);
				}
			}
		}
		scan.close();
		
	}
}
