/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class ShellSort {

    public static void shellSort(int[] array) {
        int n = array.length;
        // reduce the gap in every iteration
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do insertion sort for current gap
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                // Shifts items greater than Temp to the right
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                // assign temp in its correct position
                array[j] = temp;
            }
        }
    }

    public void printShellSortedArray(int [] array){

        System.out.print("Sorted Array for Shell Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
