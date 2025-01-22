package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        //Inserts the 'Transition element' into its correct position in the sorted portion of the array.
        //TODO: TO BE IMPLEMENTED
        int j = i - 1;

        // Move elements of a[0..i-1], that are greater than transition, one position ahead
        while (j >= 0 && a[j].compareTo(transition) > 0) {
            a[j + 1] = a[j]; 
            j--; 
        }
        a[j + 1] = transition; 
    }

    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
