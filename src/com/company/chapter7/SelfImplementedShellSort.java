package com.company.chapter7;

public class SelfImplementedShellSort {
    public void shellSort(int[] array)
    {
        int n = array.length;
        for(int gap = n/2;gap>=1;gap /= 2)
        {
            for (int i = gap; i < n; i++) {
                for (int j = i-gap; j>=0 ; j -= gap) {
                    if(array[j+gap]>array[j])
                        break;
                    else
                    {
                        swap(array,j+gap,j);
                    }
                }
            }
        }
    }

    public void swap(int[] array,int index1,int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void displayArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println(" ");
    }
}
