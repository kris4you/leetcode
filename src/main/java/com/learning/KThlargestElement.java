package com.learning;

import java.util.PriorityQueue;
import java.util.Queue;

public class KThlargestElement {

    public static int findKthLargest(int[] nums, int k) {

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

        for (int num : nums) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }

        }
        System.out.println(pq);
        return pq.poll();
    }

    public static void main(String[] args) {

        System.out.println(findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
    }
}
