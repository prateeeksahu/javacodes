package practice.patterns;

public class Main {
    public static void main(String[] args) {

       //bubble sort

        int[] arr = {1,65,35,85,42,67,86,88};
        int n = arr.length;
        int t =0;

        for(int i = 0;i<n-1;i++){
            for(int j = 0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                   t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
                }
            }
        }

        for (int x:arr) {
            System.out.print(x + " ");

        }

    }
}
