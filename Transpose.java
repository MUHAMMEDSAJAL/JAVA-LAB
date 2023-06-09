import java.util.Scanner;
class MatrixTranspose {
    public static void main(String args[]) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total rows: ");
        int row = s.nextInt();
        System.out.println("Enter total columns: ");
        int column = s.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before Transpose is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}