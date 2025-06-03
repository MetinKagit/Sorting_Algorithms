/*
 * Name&Surname: Metin Kagit
 * Student_No: 1821221033
 * Mail: metin.kagit@stu.fsm.edu.tr
 * Algorithm Analysis & Design - HW1
 * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner_choice = new Scanner(System.in);
        Scanner scanner_size = new Scanner(System.in);
        boolean isProcessContinue = true;
        int size = 0;
        long startTime;
        long endTime;

        while (isProcessContinue) {

            //Ask for input to choose process
            System.out.print("Enter '1' for - Random\nEnter '2' for - Reverse\n" +
                    "Enter '3' for - Exit \nPlease select a proecss: ");
            int process = scanner_choice.nextInt();


            if( process == 3){
                isProcessContinue = false;
            } else if (process != 1 && process != 2 && process != 3) {
                scanner_choice.nextLine();
                System.out.println("Please select a valid process!");
                //continue;
            } else{
                System.out.print("Enter an array size: ");
                size = scanner_size.nextInt();
                int[] array1 = new int[size];
                int[] array2 = new int[size];
                int[] array3 = new int[size];
                int[] array4 = new int[size];
                int[] array5 = new int[size];
                int[] array6 = new int[size];
                int[] array7 = new int[size];
                int[] array8 = new int[size];

                //Fill the array with random numbers
                //Size parametr determines the bound of generated numbers
                generateRandomNumbers(array1, size);
                generateRandomNumbers(array2, size);
                generateRandomNumbers(array3, size);
                generateRandomNumbers(array4, size);
                generateRandomNumbers(array5, size);
                generateRandomNumbers(array6, size);
                generateRandomNumbers(array7, size);
                generateRandomNumbers(array8, size);

                printArray(array1);
                printArray(array2);
                printArray(array3);
                printArray(array4);
                printArray(array5);
                printArray(array6);
                printArray(array7);
                printArray(array8);
                if (process == 1) {

                    //Selection Sort
                    System.out.println("---- Selection Sort ----");
                    SelectionSort ss = new SelectionSort();
                    startTime = System.currentTimeMillis();
                    ss.selectionSort(array1);
                    endTime = System.currentTimeMillis();
                    System.out.println("---------------------------------\" ");
                    System.out.println("Selection Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //Insertion Sort
                    System.out.println("---- Insertion Sort ----");
                    InsertionSort in = new InsertionSort();
                    startTime = System.currentTimeMillis();
                    in.insertionSort(array2);
                    endTime = System.currentTimeMillis();
                    System.out.println("---------------------------------\" ");
                    System.out.println("Insertion Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //Merge Sort
                    System.out.println("---- Merge Sort ----");
                    MergeSort ms = new MergeSort();
                    startTime = System.currentTimeMillis();
                    ms.mergeSort(array3, 0, array3.length - 1);
                    endTime = System.currentTimeMillis();
                    ms.printMergeSortedArray(array3);
                    System.out.println("---------------------------------\" ");
                    System.out.println("Merge Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //3-Way Merge Sort
                    System.out.println("---- 3-Way Merge Sort ----");
                    ThreeWayMergeSort twms = new ThreeWayMergeSort();
                    startTime = System.currentTimeMillis();
                    twms.threeWayMergeSort(array4, 0, array4.length - 1);
                    endTime = System.currentTimeMillis();
                    twms.printThreeWayMergeSortedArray(array4);
                    System.out.println("---------------------------------\" ");
                    System.out.println("3-Way Merge Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //Heap Sort
                    System.out.println("---- Heap Sort ----");
                    HeapSort hs = new HeapSort();
                    startTime = System.currentTimeMillis();
                    hs.heapSort(array5);
                    endTime = System.currentTimeMillis();
                    hs.printHeapSortedArray(array5);
                    System.out.println("---------------------------------\" ");
                    System.out.println("Heap Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //Quick Sort with Lomuto
                    System.out.println("---- Quick Sort with Lomuto ----");
                    QuickSortWithLomuto qswl = new QuickSortWithLomuto();
                    startTime = System.currentTimeMillis();
                    qswl.quickSortWithLomuto(array6, 0, array6.length - 1);
                    endTime = System.currentTimeMillis();
                    qswl.printQuickLomutoSortedArray(array6);
                    System.out.println("---------------------------------\" ");
                    System.out.println("Quick Sort with Lomuto That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //Quick Sort with Hoare
                    System.out.println("---- Quick Sort with Hoare ----");
                    QuickSortWithHoare qswh = new QuickSortWithHoare();
                    startTime = System.currentTimeMillis();
                    qswh.quickSortWithHoare(array7, 0, array7.length - 1);
                    endTime = System.currentTimeMillis();
                    qswh.printQuickHoareSortedArray(array7);
                    System.out.println("---------------------------------\" ");
                    System.out.println("Quick Sort with Hoare That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    //Shell Sort
                    System.out.println("---- Shell Sort ----");
                    ShellSort shs = new ShellSort();
                    startTime = System.currentTimeMillis();
                    shs.shellSort(array8);
                    endTime = System.currentTimeMillis();
                    shs.printShellSortedArray(array7);
                    System.out.println("---------------------------------\" ");
                    System.out.println("Shell Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                } else if(process == 2){

                    // Reverse Selection Sort
                    System.out.println("---- Reverse Selection Sort ----");
                    Arrays.sort(array1);
                    Main.printArray(reverseArray(array1));
                    SelectionSort ss = new SelectionSort();
                    startTime = System.currentTimeMillis();
                    ss.selectionSort(reverseArray(array1));
                    endTime = System.currentTimeMillis();
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Selection Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");


                    // Reverse Insertion Sort
                    System.out.println("---- Reverse Insertion Sort ----");
                    Arrays.sort(array2);
                    Main.printArray(reverseArray(array2));
                    InsertionSort in = new InsertionSort();
                    startTime = System.currentTimeMillis();
                    in.insertionSort(reverseArray(array2));
                    endTime = System.currentTimeMillis();
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Insertion Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");


                    // Reverse Merge Sort
                    System.out.println("---- Reverse Merge Sort ----");
                    Arrays.sort(array3);
                    Main.printArray(reverseArray(array3));
                    MergeSort ms = new MergeSort();
                    startTime = System.currentTimeMillis();
                    ms.mergeSort(reverseArray(array3), 0, array3.length - 1);
                    endTime = System.currentTimeMillis();
                    ms.printMergeSortedArray(array3);
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Merge Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    // Reverse 3-Way Merge Sort
                    System.out.println("---- Reverse 3-Way Merge Sort ----");
                    Arrays.sort(array4);
                    Main.printArray(reverseArray(array4));
                    ThreeWayMergeSort twms = new ThreeWayMergeSort();
                    startTime = System.currentTimeMillis();
                    twms.threeWayMergeSort(reverseArray(array4), 0, array4.length - 1);
                    endTime = System.currentTimeMillis();
                    twms.printThreeWayMergeSortedArray(array4);
                    System.out.println("---------------------------------");
                    System.out.println("Reverse 3-Way Merge Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    // Reverse Heap Sort
                    System.out.println("---- Reverse Heap Sort ----");
                    Arrays.sort(array5);
                    Main.printArray(reverseArray(array5));
                    HeapSort hs = new HeapSort();
                    startTime = System.currentTimeMillis();
                    hs.heapSort(array5);
                    endTime = System.currentTimeMillis();
                    hs.printHeapSortedArray(array5);
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Heap Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    // Reverse Quick Sort with Lomuto
                    System.out.println("---- Reverse Quick Sort with Lomuto ----");
                    Arrays.sort(array6);
                    Main.printArray(reverseArray(array6));
                    QuickSortWithLomuto qswl = new QuickSortWithLomuto();
                    startTime = System.currentTimeMillis();
                    qswl.quickSortWithLomuto(array6, 0, array6.length - 1);
                    endTime = System.currentTimeMillis();
                    qswl.printQuickLomutoSortedArray(array6);
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Quick Sort with Lomuto That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    // Reverse Quick Sort with Hoare
                    System.out.println("---- Reverse Quick Sort with Hoare ----");
                    Arrays.sort(array7);
                    Main.printArray(reverseArray(array7));
                    QuickSortWithHoare qswh = new QuickSortWithHoare();
                    startTime = System.currentTimeMillis();
                    qswh.quickSortWithHoare(array7, 0, array7.length - 1);
                    endTime = System.currentTimeMillis();
                    qswh.printQuickHoareSortedArray(array7);
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Quick Sort with Hoare That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");

                    // Reverse Shell Sort
                    System.out.println("---- Reverse Shell Sort ----");
                    Arrays.sort(array8);
                    Main.printArray(reverseArray(array8));
                    ShellSort shs = new ShellSort();
                    startTime = System.currentTimeMillis();
                    shs.shellSort(array8);
                    endTime = System.currentTimeMillis();
                    shs.printShellSortedArray(array8);
                    System.out.println("---------------------------------");
                    System.out.println("Reverse Shell Sort That took: " + (endTime - startTime) + " milliseconds");
                    System.out.println("---------------------------------");
                }
            }

        }
        scanner_choice.close();
        scanner_size.close();
    }

    //Generate randon numbers and fill the array
    public static void generateRandomNumbers(int[] array, int size) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(size+1); // Generates a random integer between 0 (inclusive) and 100000 (exclusive)
        }
    }
// Reves the array to second method
    public static int[] reverseArray(int[] array) {

        int[] reverse_array = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            reverse_array[i] = array[array.length - i - 1];
        }
        return reverse_array;
    }

// Print the given array
    public static void printArray(int[] array) {

        System.out.print("The initial state of the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
