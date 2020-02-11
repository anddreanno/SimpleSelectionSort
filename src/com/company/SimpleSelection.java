package com.company;

public class SimpleSelection {

    private SimpleSelection() {}

    public static int[] sort(int[] array) {
        if (array.length == 0) System.err.println("Ошибка, массив должен содержать хотя бы один элемент");
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[min] > array[j])
                    min = j;
            }
            if(i != min)
                swap(array, i, min);
        }
        return array;
    }
    private static void swap(int[] array, int k, int l) {
        int temp = array[k];
        array[k] = array[l];
        array[l] = temp;
    }
}
