package com.algorithms;

public class MergeSort {

    public void mergeSort(int[] array) {
        // TODO-Lab2.4: delegate to private mergeSort.  Follow example in QuickSort
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int start, int end) {
        // TODO-Lab2.4: Implement the logic below
        // pseudo code:
        //    mergeSort(array, start, end)
        //    if start<end
        //       middle = (end-start)/2 + start
        //       mergeSort(array, start, middle)
        //       mergeSort(array, middle+1, end)
        //       merge(array, start, middle, end)

        if (start < end ){
            int middle = (end-start)/2 + start;
            mergeSort(array,start, middle);
            mergeSort(array, middle+1, end);
            merge(array, start, middle, end);
        }

    }

    private void merge(int[] array, int start, int middle, int end) {
        // TODO-Lab2.4: Implement the logic below
        // pseudo code:
        //        merge(array, start, middle, end)
        //        i = start
        //        j = middle + 1
        //        arrayTemp = initArrayOfSize(end - start + 1)
        //        for (k = 0 until (end of arrayTemp))
        //             if (i <= middle && (j > end || array[i] <= array[j]))
        //                 arrayTemp[k] = array[i]
        //                 i++
        //	           else
        //                  arrayTemp[k] = array[j]
        //                  j++
        //        copyArray(arrayTemp, array, start)
        int i = start;
        int j = middle+1;
        int[] temp= new int[(end-start)+ 1];
        for(int k = 0; k < temp.length; k++){
            if( i <= middle && (j > end || array[i] <= array[j])){
                temp[k] = array[i];
                i++;
            }else{
                temp[k] = array[j];
                j++;
            }
        }
        System.arraycopy(temp, 0, array, start, temp.length);

    }

    public static void main(String[] args) {
        MergeSort sorter = new MergeSort();
        int[] array = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        System.out.println("Unsorted:");
        for (int a : array) {
            System.out.println(a);
        }
        sorter.mergeSort(array);
        System.out.println("Sorted:");
        for (int a : array) {
            System.out.println(a);
        }
    }
}
