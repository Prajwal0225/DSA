/*
*       import java.util.Arrays;
!       Arrays.sort(arr);
?       For sorting in range
!       Arrays.sort(arr,si,ei);
!       Time Complexity: O(n^2);
 */

/*
todo    ---For decending order We have to use Collections -----
   
*       import java.util.Collections;
!       Array.sort(arr,Collections.reverseOrder())
!       Arrays.sort(arr,si,ei,collections.reverseOrder())

*keep that in mind that collection only work in objects 
 */

import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sorting {

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // insertionSort(arr)
        // ? Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3); // ! Sorting in range

        // *Reverse Order*
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        printArr(arr);
    }
}
