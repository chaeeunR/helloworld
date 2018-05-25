import java.util.Scanner;

public class num_1550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num [] = sc.next().split("");
		int sum = 0;
		int a = 0;
		int j = 0;
		for (int i=num.length-1; i>=0;i--) {
			switch(num[i]) {
			case "A" :
				a = 10;
				break;
			case "B" :
				a = 11;
				break;
			case "C" :
				a = 12;
				break;
			case "D" :
				a = 13;
				break;
			case "E" :
				a = 14;
				break;
			case "F" :
				a = 15;
				break;
			default :
				a = Integer.valueOf(num[i]);
			}
			sum += a * (Math.pow(16, j));
			j++;
		}
		System.out.println(sum);
		sc.close();
	}

}
