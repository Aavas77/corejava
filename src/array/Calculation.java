package array;

public class Calculation {

	public static void main(String[] args) {
		
		int mat1[][] = {{3,4,5},{34,45,56},{45,67,89}};
		int mat2[][] = {{45,23,45},{44,22,44},{45,94,23}};
		
		int mat3[][] = new int[3][3];
		
		//addition
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
