import java.util.Scanner;

public class sumDiagonal {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = ip.nextInt();   
        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = ip.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                
                if (i == j || i + j == n - 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println("Sum of diagonals: " + sum);

        ip.close();
    }
}
