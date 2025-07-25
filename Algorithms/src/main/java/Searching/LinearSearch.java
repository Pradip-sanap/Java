package Searching;

public class LinearSearch {

    public static void main(String[] args){
        System.out.println("Hello");
        int[] arr = {10, 20, 30, 40,50, 60};

        linearSearch(arr, 50);


    }

    static void linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == key){
                System.out.println("Element found at index = "+ i);
            }
        }
    }
}
