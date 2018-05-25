import java.util.Arrays;
import java.util.Scanner;

public class num_5054 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt(); // case 개수
		for (int i = 0; i<su; i++) {
			int all = sc.nextInt(); // 상점 수
			int st[] = new int [all]; 
			for(int j=0; j<all; j++) {
			 st[j] = sc.nextInt();
			}
			Arrays.sort(st);
			int k = st.length / 2;
			int length = (st[k] - st[0])*2 + (st[all-1]-st[k])*2;
			System.out.println(length);
		}
		sc.close();
	}
}
