import java.util.Scanner;

public class num_5361 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		double sum = 0;
		for (int i=0; i<su; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			
			if(a>=0 && b>=0 && c>=0 && d>=0 && e>=0) {
			sum = a*350.34 + b*230.90 + c*190.55 + d*125.30 + e*180.90;
			
			if(sum <= 100000000) {
				System.out.printf("$%.2f",sum);
				System.out.println();
				}
			}
		}
		sc.close();
	}
}
