package Searching;

public class BinarySeach {
    public static void main(String[] args) {
        // array must be sorted
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        binarySearch(arr, 0, arr.length, 55);

    }

    static void binarySearch(int[] arr,int front, int rear, int key){
        int mid = (rear + front)/2;
        if(front >= rear){
            System.out.println("element not found");
            return;
        }
        if(arr[mid] == key){
            System.out.println("Element found at index: "+ mid);
        } else if (key > arr[mid] ) {
            binarySearch(arr, mid+1, rear, key);
        } else if(key < arr[mid]) {
            binarySearch(arr, front, mid-1, key);
        }
    }
}
