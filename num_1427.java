import java.util.Arrays;
import java.util.Scanner;

public class num_1427 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String su = sc.next();
		String arr[] = su.split("");
		Arrays.sort(arr);		
		for(int i = (arr.length-1); i>=0; i--) {
			System.out.print(arr[i]);
		}
		sc.close();
	}

}
