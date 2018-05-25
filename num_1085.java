import java.util.Scanner;

public class num_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int list[] = {x,y,(w-x),(h-y)};
		int result = 0;
		
		if(y>=1  && y<=h-1 && x>=1 && x<=w-1) {
			for(int i = 1; i<list.length; i++) {
				if(list[i] >= list[i-1]) {
					result = list[i-1];
				}
				else {
					result = list[i];
				}
				list[i] = result;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
