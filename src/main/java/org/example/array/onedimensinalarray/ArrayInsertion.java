package org.example.array.onedimensinalarray;

public class ArrayInsertion {
    int arr[] = null;

    public ArrayInsertion(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeAdded) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeAdded;
                System.out.println("Successfully added!");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
                System.out.println("");
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    public void searchArrayValue(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteArrayValue(int valueIndexToDelete) {
        try {
            arr[valueIndexToDelete] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully!");
        } catch (Exception e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }
}
