package step2;

import java.util.Scanner;

public class num_1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double k = (double)a / b; // a와 b 둘 중에 하나가 double이면 가능
		System.out.println(k);
		
		
//		double iValue;
//		iValue = 3.0 / 100;
		
//		System.out.println(iValue);
		
		
//		if(a>0 && b<10) {
//			System.out.println(a%b);
//		}
//		int cnt = 0;
//		int na = 0;
//		int k = a%b;
//		int[] sum = new int [100];
//		
//		while(true) {
//			int kk = k * 10;
//			na = kk/b;
//			k= kk%b;
//			sum[cnt] = na;
//			cnt ++;
//			if(cnt == 10 || k == 0) {
//				System.out.print(a/b+".");
//				for (int i = 0; i < cnt; i++) {
//					System.out.print(sum[i]);
//				}
//				break;
//			}
//		}
		sc.close();
	}
}
