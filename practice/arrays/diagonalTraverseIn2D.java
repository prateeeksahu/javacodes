package practice.arrays;
import java.util.*;
public class diagonalTraverseIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] arr = new int [n][n];

        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int g = 0;g< arr.length;g++){
            for(int i = 0, j = g; j<arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
