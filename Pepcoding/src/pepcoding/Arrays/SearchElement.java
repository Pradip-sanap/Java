package pepcoding.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        // search element in array.

        int[] arr = new int[]{40, 20, 70, 50, 10, 90, 60};

        int key = 50;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println("Element found at :" + index);

    }
}
