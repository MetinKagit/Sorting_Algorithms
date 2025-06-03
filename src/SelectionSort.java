/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class SelectionSort {

    public void selectionSort(int[] array) {
        int min = 0;
        int temp = 0;

        //Searcch for the smallest element in array
        for (int i = 0; i < array.length-1; i++){
            min = i;
            for (int j = i; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j; // New smallest element
                }
            }
            //Swap the items index
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        //printSelectionSortedArray(array);
    }
    public void printSelectionSortedArray(int [] array){

        System.out.print("Sorted Array for Selection Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
