import java.util.Scanner;

public class matrix {
    void matrixmul(int m, int n, int p, int q) {
        int[][] a, b, t;
        a = new int[m][n];
        b = new int[p][q];
        t = new int[q][m];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        System.out.println("enter the elements of the matrix B: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
                sc.close();

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    t[i][j] += a[i][j] * b[i][j];

                }
            }

        }
        System.out.println("elements of the result matrix is ");
    }
}