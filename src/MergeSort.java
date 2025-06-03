/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class MergeSort {
    void mergePart(int array[], int start, int mid, int end) {
        // Find sizes of two subarrays to be merged
        int low = mid - start + 1;
        int high = end - mid;

        // Create temp arrays
        int L[] = new int[low];
        int R[] = new int[high];

        int i = 0;
        int j = 0;
        /*Copy data to temp arrays*/
        for (i = 0; i < low; i++) {
            L[i] = array[start + i];
        }
        for (j = 0; j < high; j++) {
            R[j] = array[mid + 1 + j];
        }
        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        i = 0;
        j = 0;
        // Initial index of merged subarray array
        int k = start;
        while (i < low && j < high) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
         // Copy remaining elements of L[] if any
        while (i < low){
            array[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < high){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge sort main function
    public void mergeSort(int array[], int start, int end){
        int mid;
        if (start < end) {
            // Find the middle point
            mid = (start + end) / 2;

            // Sort first and second halves
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);

            // Merge the sorted halves
            mergePart(array, start, mid, end);
        }
    }

    public void printMergeSortedArray(int [] array){

        System.out.print("Sorted Array for Merge Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
