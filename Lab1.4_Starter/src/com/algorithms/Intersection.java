package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

	public List<Integer> intersectionFast(int[]a, int[]b){
		List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int indexA = 0;
        int indexB = 0;

        while (indexA < a.length && indexB < b.length){
            if(a[indexA] == b[indexB]){
                answer.add(a[indexA]);
                indexA++;
                indexB++;
            } else if (a[indexA] > b[indexB] ) {
                indexB++;
            }else{
                indexA++;
            }
        }

        return answer;
	}

    public static void main(String args[]) {
        Intersection simpleIntersection = new Intersection();
      //  System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3,1}, new int[]{4, 2, 3, 9, 1}));
        System.out.println(simpleIntersection.intersectionFast(new int[]{1,2,3,4,20}, new int[]{5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}));
    }
}
