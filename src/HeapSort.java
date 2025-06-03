/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */
public class HeapSort {

    public void heapSort(int array[]){
        builtMaxHeapSort(array);

        for (int i = array.length - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    void builtMaxHeapSort(int array[]){
        int n = array.length;
        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    void heapify(int array[], int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If the left child is larger than the root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If the largest is not the root
        if (largest != i) {
            // Swap the root with the largest element
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }


    }

    public void printHeapSortedArray(int [] array){

        System.out.print("Sorted Array for Heap Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
}
