package com.algorithms;

public class BinarySearch {
    public static boolean binarySearch(int target, int[] sortedArray) {
        return binarySearch(target, sortedArray, 0, sortedArray.length - 1);
    }

    private static boolean binarySearch(int target, int[] array, int start, int end) {

        // TODO-Lab2.2: Implement binary search logic here using recursion
        // TODO-Lab2.2: Implement binary search logic here using recursion
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        if (start <= end) {
            //[1,2]
            int mid = (end - start) / 2 + start; //3
            if (array[mid] == target) {
                return true;
            }
            if (array[mid] > target) {
                                    // 2 , [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], start = 0, end = 2
                return binarySearch(target, array, start, mid-1);
            }                       // 2 , [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], start = 0, end = 2
            return binarySearch(target, array, mid+1, end);
        }
        return false;
    }




    public static void main(String[] args) {
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(BinarySearch.binarySearch(2, sorted));
    }
}

