import java.util.Scanner;

public class algospot_Drawrect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		int x = 0;
		int y = 0;
		int list[] = new int[6];
		for(int j=0; j<su;j++) {
			for(int i=0; i<6; i++) {
					list[i]=sc.nextInt();
			}
			if(list[0]==list[2]) {
				x = list[4];
			}
			else if(list[2]==list[4]) {
				x = list[0];
			}
			else if(list[0]==list[4]) {
				x = list[2];
			}
			if(list[1]==list[3]) {
				y = list[5];
			}
			else if(list[3]==list[5]) {
				y = list[1];
			}
			else if(list[1]==list[5]) {
				y = list[3];
			}
			System.out.println(x+" "+y);
		}	
		sc.close();	
	}
}
