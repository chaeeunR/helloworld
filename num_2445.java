import java.util.Scanner;

public class num_2445 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String arr[] = new String[2*n];
		String sum = "";
		for (int i = 1; i<2*n;i++) {
			if(i<=n) {
				sum += "*";
				arr[i] = sum;
				System.out.printf("%"+(-n)+"s",sum);
				System.out.printf("%"+n+"s",sum);
				System.out.println();
			}
			else {
				int k = (i-n);
				arr[i] = arr[n-k];
				System.out.printf("%"+(-n)+"s",arr[i]);
				System.out.printf("%"+n+"s",arr[i]);
				System.out.println();
			}
			
		}
		sc.close();
	}

}
