import java.util.Scanner;

public class num_2455 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String []list = new String[8];
		
		for(int i=0; i<8; i++) {
			list[i] = sc.next();
		}
		int sum = 0;
		int big = 0;
		for(int i=1; i<8; i++) {
			if(i%2==1) {
				sum += Integer.valueOf(list[i]);
				if (big < sum) {
					big = sum;
				}
			}
			else {
				sum -= Integer.parseInt(list[i]);
			}
		}
		System.out.println(big);
		sc.close();
	}

}
