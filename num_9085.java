import java.util.Scanner;

public class num_9085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int TestTotal = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<TestTotal; i++) {
			int SuTotal = sc.nextInt();
			for(int j= 0; j<SuTotal; j++) {
				int su = sc.nextInt();
				sum += su;
			}
			System.out.println(sum);
			sum = 0;
		}
		sc.close();
	}

}
