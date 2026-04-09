package week7;

public class SortMain {
    public static void main(String[] args) {
            int data[] = {10, 40, 30, 50, 70, 20, 100, 90}; 
        
        MergeSort m = new MergeSort();
        System.out.println("Sorting with merge sort");
        
        System.out.println("Initial Data:");
        m.printArray(data);

        m.merge(data); 

        System.out.println("Sorted Data");
        m.printArray(data);
    }
}
