import java.util.Scanner;

public class num_1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		
		for(int i=1;i<=45;i++) {
			for(int j=1;j<=i;j++) {
				cnt++;
				if(cnt>=a && cnt<=b) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}

}
