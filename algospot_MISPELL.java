import java.util.Scanner;

public class algospot_MISPELL {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int index[] = new int [su];
		String arr [] = null;
		for(int i=0; i<su; i++) {
			index[i] = sc.nextInt();
			String word = sc.next();
			arr = word.split("");
			System.out.print((i+1)+" ");
			for(int j=0; j<arr.length; j++) {
				if (j+1 == index[i]) {
					arr[j] = "";
				}
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
