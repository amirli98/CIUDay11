package com.company.overview;

public class MergeSort {
    private long[] theArray;
    private int nElems;

    public MergeSort(int max)
    {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long elem)
    {
        theArray[nElems++] = elem;
    }

    public void display()
    {
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");
            System.out.println("");
        }
    }

    public void mergeSort()
    {
        long[] workspace = new long[nElems];
        recMergeSort(workspace,0,nElems-1);
    }

    private void recMergeSort(long[] workspace,int lowerBound,int upperBound)
    {
        if(lowerBound == upperBound)
            return;
        else
        {
            int mid = (upperBound-lowerBound)/2 + lowerBound;
            recMergeSort(workspace,lowerBound,mid);
            recMergeSort(workspace,mid+1,upperBound);

            merge(workspace,lowerBound,mid+1,upperBound);
        }
    }

    private void merge(long[] workspace,int lowPtr,int highPtr,int upperBound)
    {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound - lowerBound +1;

        while (lowPtr<=mid && highPtr<=upperBound)
        {
            if(theArray[lowPtr]<theArray[highPtr])
                workspace[j++] = theArray[lowPtr++];
            else
                workspace[j++] = theArray[highPtr++];
        }

        while (lowPtr <= mid)
        {
            workspace[j++] = theArray[lowPtr++];
        }

        while(highPtr <= upperBound)
        {
            workspace[j++] = theArray[highPtr++];
        }

        for(j=0; j<n; j++)
            theArray[lowerBound+j] = workspace[j];
    }
}
