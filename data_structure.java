
public class data_structure {

	public static void main(String[] args) {

		// 1차원 배열
//		int sale[] = new int[] {157,209,251,312};
//		
//		for(int i=0; i<sale.length; i++) {
//			System.out.println(i+1+"/4분기 : "+sale[i]);
//		}
		
		// 2차원 배열
		
//		int sale [][] = new int [][] {{63,84,140,130},{157,209,251,312}};
//		
//		for(int i=0; i<sale.length; i++) {
//			for(int j=0; j<sale[i].length; j++ ) {
//				System.out.println(j+1+"/4분기 : "+sale[i][j]);
//			}
//			System.out.println();
//		}
		
		// 3차원 배열
		
		int sale [][][] = new int [][][] {{{63,84,140,130},{157,209,251,312}},{{59,80,130,135},{149,187,239,310}}};
		
		for(int i=0; i<sale.length; i++) {
			System.out.println("<"+(i+1)+"팀>");
			for(int j=0; j<sale[i].length; j++) {
				for (int k=0; k<sale[i][j].length; k++) {
					System.out.println(k+1+"/4 분기 : "+sale[i][j][k]);
					
				}
				System.out.println("--------------------------------");
			}
			System.out.println();
		}
	}
}
