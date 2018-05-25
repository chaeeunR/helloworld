import java.util.Scanner;
public class num_1212 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String sum = "";
//	String st = sc.next();
	String arr[] = sc.next().split("");
	
	switch(arr[0]) {
	case "1" :
		sum += "1";
		break;
	case "2" :
		sum += "10";
		break;
	case "3" :
		sum += "11";
		break;
	case "4" :
		sum += "100";
		break;
	case "5" :
		sum += "101";
		break;
	case "6" :
		sum += "110";
		break;
	case "7" :
		sum += "111";
		break;
	default :
		sum += "0";
	}
	
	for(int i = 1; i<arr.length; i++) {
		switch(arr[i]) {
		case "1" :
			sum += "001";
			break;
		case "2" :
			sum += "010";
			break;
		case "3" :
			sum += "011";
			break;
		case "4" :
			sum += "100";
			break;
		case "5" :
			sum += "101";
			break;
		case "6" :
			sum += "110";
			break;
		case "7" :
			sum += "111";
			break;
		default :
			sum += "000";
		}
	}
	System.out.println(sum);
	sc.close();
	}
}

