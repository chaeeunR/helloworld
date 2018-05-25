package num_1212;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Change c1 = new Change();
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String arr[] = st.split("");
//		System.out.println(arr[0]);
		
		c1.setW(arr[0]);
		c1.info();
		c1.setW(arr[1]);
		c1.info();
		
		
		
		
	}

}
