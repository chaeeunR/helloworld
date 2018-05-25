import java.util.Scanner;

public class num_1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int date = sc.nextInt();
		int sum = 0;
		if(month == 1) {
			sum = date;
		}
		else {
			for (int i = 1; i< month; i++) {
				switch(i) {
					case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
						sum += 31;
						break;
					case 4 : case 6 : case 9 : case 11 :
						sum += 30;
						break;
					case 2 :
						sum += 28;
						break;
				}
			}
			sum += date;
		}
		
		switch(sum%7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		}
		sc.close();
	}

}
