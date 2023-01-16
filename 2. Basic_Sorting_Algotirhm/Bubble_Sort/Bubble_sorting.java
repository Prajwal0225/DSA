//Idea : Large elements come to the end of array by swapping with adjacent elements
//! Time Complexity: O(n^2)

public class Bubble_sorting {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swaping = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaping++;
                }
            }
            if (swaping == 0) {
                return;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }
}
