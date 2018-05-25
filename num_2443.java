import java.util.Scanner;

public class num_2443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = (2*n)-1;
		
		for(int i = 0; i<n; i++) {
			String star = "";
			for (int j=0; j<k; j++ ) {
				star += "*";
			}
			System.out.printf("%"+(k+i)+"s",star);
			k -= 2;
			System.out.println();
		}
		
		sc.close();
	}

}
