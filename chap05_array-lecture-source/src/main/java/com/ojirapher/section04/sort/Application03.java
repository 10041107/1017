package main.java.com.ojirapher.section04.sort;

public class Application03 {
    public static void main(String[] args) {
        //최소값 정렬 알고리즘
        int[] arr = {2, 5, 4, 6, 1, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;  // Set the current index as the minimum

            // Find the index of the minimum element in the remaining unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted portion
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}