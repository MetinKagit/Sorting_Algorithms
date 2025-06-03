/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class QuickSortWithHoare {
    // Function to perform quicksort using Hoare partitioning
    static int partition(int[] array, int start, int end){

        int pivot = array[start];
        int i = start - 1, j = end + 1;

        while (true) {
            // Find leftmost element greater or equal to pivot
            do {
                i++;
            } while (array[i] < pivot);

            // Find rightmost element smaller or equal to pivot
            do {
                j--;
            } while (array[j] > pivot);

            // If two pointers met.
            if (i >= j){
                return j;
            }

            swap(array, i, j);
        }
    }
    // Swaps array's elemnts
    static void swap(int[] array,int p1,int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    // This is the main function
    public static void quickSortWithHoare(int[] array, int start, int end) {
        if (start < end) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, start, end);

            // Recursively sort the sub-arrays
            quickSortWithHoare(array, start, pivotIndex);
            quickSortWithHoare(array, pivotIndex + 1, end);
        }
    }

    public void printQuickHoareSortedArray(int [] array){

        System.out.print("Sorted Array for Quick Sort with Hoare: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
