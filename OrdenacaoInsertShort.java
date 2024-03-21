package Project;

public class Prov {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] arrayNumbers = {5, 2, 8, 1, 3};

        // Displaying the array before sorting
        System.out.print("Array before sorting: ");
        displayArray(arrayNumbers);

        // Calling the Insertion Sort sorting method
        insertionSort(arrayNumbers);

        // Displaying the array after sorting
        System.out.print("Array after sorting: ");
        displayArray(arrayNumbers);
    }

    // Method to display elements of an array
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to sort the array using Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Moving elements of array that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Inserting key at correct position
            array[j + 1] = key;
        }
    }

    //The Insertion Sort algorithm traverses the array, "inserting" each element into the correct position,
    //so that elements to the left of the correct position are smaller or equal, and elements to the right are larger.
    //This process is repeated until the entire array is sorted.

}
	
	