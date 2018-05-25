import java.util.Scanner;

public class num_4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int Winner = (a+b) / 2;
		int Loser = a - Winner;
		if((a+b) %2 == 0 && Loser>=0) { 
			System.out.print(Winner+" ");
			System.out.println(Loser);
		}
		else {
			System.out.println(-1);
		}
		sc.close();
	}
}
