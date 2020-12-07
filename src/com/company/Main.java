package com.company;

import com.company.chapter7.SelfImplementedShellSort;


public class Main {

    public static void main(String[] args) {
        // write your code here

        SelfImplementedShellSort s = new SelfImplementedShellSort();
        int[] array = new int[]{12,234,45456,3,2,1,-1,0,-78};
        s.displayArray(array);
        s.shellSort(array);
        s.displayArray(array);
    }
}
