import java.util.Scanner;

public class num_2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
			for (int i = 0; i<n;i++) {
				int su = sc.nextInt();
					sum += su;
			}
		System.out.println(sum-(n-1));
		sc.close();
	}
}
