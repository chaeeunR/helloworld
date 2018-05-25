import java.util.Scanner;

public class num_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		String star = "*";
		for(int i = 0; i<su; i++) {
			System.out.println(star);
			star += "*";
		}
		sc.close();
	}

}
