import java.util.Scanner;

public class algospot_HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		for (int i = 0;i<su;i++) {
			String name = sc.next();
			System.out.println("Hello, "+name+"!");
		}
		sc.close();
	}

}
