import java.util.Scanner;

public class num_2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		int list[] = new int[su+1];
		list[0] = 0;
		list[1] = 1;
		for(int i = 2; i<su+1;i++) {
			sum = a+b;
			list[i] = sum;
			a = b;
			b = sum;
			
		}
		System.out.println(list[su]);
		sc.close();
	}

}
