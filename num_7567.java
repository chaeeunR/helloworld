import java.util.Scanner;
public class num_7567 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String container = sc.next();
		String con[] =  new String[container.length()];
		con = container.split("");
		int sum = 10;
		for(int i=1;i<con.length;i++) {
			if(con[i].equals(con[i-1])) {
				sum+=5;
			}
			else {
				sum+=10;
			}
			
		}
		System.out.println(sum);
		sc.close();
	}
}

