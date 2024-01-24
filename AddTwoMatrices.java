import java.util.Scanner;

public class AddTwoMatrices {

    static void printArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colomn of 1st array: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter " + r1*c1 + " elements: ");
        int [][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and colomn of 2nd array: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter " + r2*c2 + " elements: ");
        int [][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        addMatrix(arr1, arr2, r1,c1,r2,c2);
    }

    static void addMatrix(int [][]a, int [][] b, int r1, int c1, int r2, int c2 ) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition not Possible.");
            return;
        }
        int [][] ans = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                ans[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Result array after addition: ");
        printArray(ans);
    }
    public static void main(String[] args) {
        userInput();
    }
}
