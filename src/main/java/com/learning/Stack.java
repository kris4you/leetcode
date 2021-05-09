package com.learning;

import java.util.Arrays;

public class Stack {

    static class StackImpl {
        int[] arr = new int[10];
        int count = 0;

        public void push(int a) {

            if (count < arr.length) {
                arr[count++] = a;
            } else {

                arr = Arrays.copyOf(arr, count * 2);
            }
        }

        public int pop() {

            if (count > 0) {
                int temp = arr[count--];
                arr[count] = -1;
                return temp;
            }
            return -1;
        }

        @Override
        public String toString() {
            return (Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        StackImpl s = new StackImpl();

        for (int i = 0; i < 12; i++) {
            s.push(i);
        }
        for (int i = 0; i < 5; i++) {
            s.pop();
        }
        System.out.println(s);
    }
}
