/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class ThreeWayMergeSort {

    void threeWayMergePart(int[] array, int start, int mid1, int mid2, int end){
        int n1 = mid1 - start + 1;
        int n2 = mid2 - mid1;
        int n3 = end - mid2;

        // Create temporary arrays to hold the three parts
        int[] left = new int[n1];
        int[] middle = new int[n2];
        int[] right = new int[n3];

        // Copy data to temporary arrays
        System.arraycopy(array, start, left, 0, n1);
        System.arraycopy(array, mid1 + 1, middle, 0, n2);
        System.arraycopy(array, mid2 + 1, right, 0, n3);

        // Merge the three arrays back into the original array
        int i = 0, j = 0, k = 0, p = start;
        while (i < n1 && j < n2 && k < n3) {
            if (left[i] <= middle[j] && left[i] <= right[k]) {
                array[p++] = left[i++];
            } else if (middle[j] <= left[i] && middle[j] <= right[k]) {
                array[p++] = middle[j++];
            } else {
                array[p++] = right[k++];
            }
        }

        // Copy the remaining elements of left[], middle[], and right[]
        while (i < n1) {
            array[p++] = left[i++];
        }

        while (j < n2) {
            array[p++] = middle[j++];
        }

        while (k < n3) {
            array[p++] = right[k++];
        }
    }

    public void threeWayMergeSort(int[] array, int start, int high){

        if (start < high) {
            // Divide the array into three parts according to mid1 and mid2
            int mid1 = start + (high - start) / 3;
            int mid2 = start + 2 * (high - start) / 3;

            // Recursively sort each part
            threeWayMergeSort(array, start, mid1);
            threeWayMergeSort(array, mid1 + 1, mid2);
            threeWayMergeSort(array, mid2 + 1, high);

            // Merge the three sorted parts
            threeWayMergePart(array, start, mid1, mid2, high);
        }

    }

    public void printThreeWayMergeSortedArray(int [] array){

        System.out.print("Sorted Array for 3-Way Merge Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
