import java.util.Scanner;

public class SelectionSort {
    public static void selectionSortIterative() {
        //TYPE YOUR CODE HERE

            System.out.print("Array after iteration " + (i + 1) + ": ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        selectionSortIterative(array);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

