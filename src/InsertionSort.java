/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class InsertionSort {

    public void insertionSort(int[] array) {
        // Iterate through the array
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            //Shift elements greater than the current element to the right
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            //Move the current element in its correct position
            array[j + 1] = temp;
        }
        //printInsertionSortedArray(array);
    }

    public void printInsertionSortedArray(int [] array){

        System.out.print("Sorted Array for Insertion Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
