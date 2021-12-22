public class matrixMulti //filename should be same as class name
{
	public static void main(String[] args) {
		
        int a[][] ={{1,1,1},{2,2,2},{3,3,3}};
        int b[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int c[][] = new int[3][3];
        System.out.println("\nMatrix A\n");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j] + "\t");
            }
        System.out.println();
        }
        System.out.println("\nMatrix B\n");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(b[i][j] + "\t");
            }
        System.out.println();
        }
        System.out.println("\nMatrix A x B\n");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j]=0;
                for(int k=0; k<3; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            System.out.print(c[i][j] + "\t");
            }
        System.out.println();
        }
		
	}
}
