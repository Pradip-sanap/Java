package pepcoding.Arrays;

public class spanOfArray {
    public static void main(String[] args) {
        // calculate span of array.
        // find min and max from array and do [max - min] , which result in span

        int[] arr = new int[]{43, 23, 78, 56, 10, 82};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int span = max - min;
        System.out.println(span);

    }
}
