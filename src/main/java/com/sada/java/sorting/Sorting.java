package com.sada.java.sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] input = {2,5,8,12,33,7,21,38,16,11,1,18,26};
        Sorting sorting = new Sorting();
        sorting.bubbleSort(input);
        input = new int[]{2, 5, 8, 12, 33, 7, 21, 38, 16, 11, 1, 18, 26};
        sorting.selectionSort(input);
    }

    void bubbleSort(int[] ints){
        printArray(ints);
        int n = ints.length;
        for (int i=0; i < n-1 ; i++){
            for(int j=0; j<n-i-1;j++){
                if(ints[j] > ints[j+1]){
                    int temp=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=temp;
                }
            }
        }
        printArray(ints);
    }

    void selectionSort(int[] input){
        printArray(input);
        int n = input.length;
        for (int i=0; i < n-1 ; i++){
            int min_element_index=i;
            for (int j=i+1; j<n;j++){
                if(input[min_element_index] > input[j]){
                    min_element_index=j;
                }
            }
            int temp = input[min_element_index];
            input[min_element_index] = input[i];
            input[i] = temp;
        }
        printArray(input);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
