/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class QuickSortWithLomuto {

    static int partition(int [] array,int start,int end){

        int pivot = array[end];
        // Index of smaller element in array
        int i = (start - 1);

        for (int j = start; j <= end- 1; j++){
            // If current element then or equal to pivot
            if (array[j] <= pivot){
                i++; // increase the index of smaller element
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);

        return (i + 1);
    }

    // Swaps array's elemnts
    static void swap(int[] array,int p1,int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    //This is the main function
    static void quickSortWithLomuto(int []array, int start,int end){

        if (start < end){
        /* part is partitioning index,
        array[p] is now at right place */
            int part = partition(array, start, end);

            // Separately sort elements before
            // partition and after partition
            quickSortWithLomuto(array, start, part - 1);
            quickSortWithLomuto(array, part + 1, end);
        }
    }

    public void printQuickLomutoSortedArray(int [] array){

        System.out.print("Sorted Array for Quick Sort with Lomuto: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}

