
public class data_structure {

	public static void main(String[] args) {

		// 1���� �迭
//		int sale[] = new int[] {157,209,251,312};
//		
//		for(int i=0; i<sale.length; i++) {
//			System.out.println(i+1+"/4�б� : "+sale[i]);
//		}
		
		// 2���� �迭
		
//		int sale [][] = new int [][] {{63,84,140,130},{157,209,251,312}};
//		
//		for(int i=0; i<sale.length; i++) {
//			for(int j=0; j<sale[i].length; j++ ) {
//				System.out.println(j+1+"/4�б� : "+sale[i][j]);
//			}
//			System.out.println();
//		}
		
		// 3���� �迭
		
		int sale [][][] = new int [][][] {{{63,84,140,130},{157,209,251,312}},{{59,80,130,135},{149,187,239,310}}};
		
		for(int i=0; i<sale.length; i++) {
			System.out.println("<"+(i+1)+"��>");
			for(int j=0; j<sale[i].length; j++) {
				for (int k=0; k<sale[i][j].length; k++) {
					System.out.println(k+1+"/4 �б� : "+sale[i][j][k]);
					
				}
				System.out.println("--------------------------------");
			}
			System.out.println();
		}
	}
}
