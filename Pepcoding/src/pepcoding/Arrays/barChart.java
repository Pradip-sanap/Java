package pepcoding.Arrays;

public class barChart {
    public static void main(String[] args) {
/*
        {3, 1, 0, 4, 2}
        0 0 0 0 0
        0 0 0 1 0
        1 0 0 1 0
        1 0 0 1 1
        1 1 0 1 1
*/
        int[] arr = {3, 1, 0, 4, 2};
        int N = arr.length;
        int[][] bar = new int[5][5];

        for(int i=0; i<N; i++) {
//            System.out.print(i +" :");
            for (int j = 0; j < N; j++) {
//                System.out.print(j +" ");
                if (arr[j] >= N - i) {
                    bar[i][j] = 1;
                }

            }
//            System.out.println();

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(bar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
