package com.company.overview;

import java.util.Random;

public class MergeSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        MergeSort mSortArray;
        mSortArray = new MergeSort(maxSize);

        /*System.arraycopy();*/
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            mSortArray.insert(random.nextLong());
        }

        mSortArray.display();
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        mSortArray.mergeSort();


        System.out.println("-----------------------------");
        mSortArray.display();
    }
}
