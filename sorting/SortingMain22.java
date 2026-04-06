package sorting;

public class SortingMain22 {
    public static void main(String[] args) {
        int [] a = {34, 7, 23, 32, 5, 62};
        int [] b = {30, 20, 2, 8, 14};
        int [] c = {40, 10, 4, 9, 3};
        Sorting22 sorting = new Sorting22(a);
        Sorting22 sorting2 = new Sorting22(b);
        Sorting22 sorting3 = new Sorting22(c);

        // System.out.println("Original Array:");
        // sorting.printData();
        // sorting.bubbleSort();
        // System.out.println("Sorted array (Bubble Sort):");
        // sorting.printData();
        
        // System.out.println("Original Array:");
        // sorting2.printData();
        // sorting2.selectionSort();
        // System.out.println("Sorted array (Selection Sort):");
        // sorting2.printData();

        System.out.println("Original Array:");
        sorting3.printData();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.printData();

    }

    
}
