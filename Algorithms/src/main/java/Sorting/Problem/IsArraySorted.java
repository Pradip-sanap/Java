package Sorting.Problem;

public class IsArraySorted {
    public static void main(String[] args) {

//        int[] arr =  {20, 20, 19, 89, 89, 90};
        int[] arr =  {};

        int n = arr.length;
        if(n==0){
            System.out.println("Array is Empty");
            return;
        }
        if(n==1) {
            System.out.println("Array is sorted");
            return;
        }

        boolean flag = true;
        for(int i=1; i<n; i++) {
            if(arr[i] < arr[i-1]) {
                System.out.println("Array is unsorted");
                flag = false;
            }
        }
        if(flag){
            System.out.println("Array is sorted");
        }
    }
}
