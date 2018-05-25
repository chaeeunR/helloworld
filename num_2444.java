import java.util.Scanner;

public class num_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String arr[] = new String[2*n];
		for(int i=1; i<=2*n-1; i++) {
			String sum = "";
			if(i<=n) {
				for(int j=1; j<=2*i-1; j++) {
					sum += "*";
					arr[i] = sum;
				}
				System.out.printf("%"+(n+i-1)+"s",arr[i]);
				System.out.println();
			}
			else if(i>n) {
				int k = (i-n);
					arr[i] = arr[n-k];
					System.out.printf("%"+(arr[n].length()-k)+"s",arr[i]);
					System.out.println();
				}
				
			}
		sc.close();
		}
	}

