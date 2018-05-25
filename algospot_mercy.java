import java.util.Scanner;

public class algospot_mercy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		
		if(su>=0 && su<=10) {
			for(int i = 0; i<su; i++) {
				System.out.println("Hello Algospot!");
			}
		}
		sc.close();
	}
}
