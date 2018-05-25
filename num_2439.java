import java.util.Scanner;

public class num_2439 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		String star = "*";
		String arr[] = new String[su];
		for(int i= 0; i<su; i++) {
			arr[i] = star;
			System.out.printf("%"+su+"s",arr[i]);
			System.out.println();
			star += "*";
		}
		sc.close();
	}
}