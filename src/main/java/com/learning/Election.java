package com.learning;

import java.util.ArrayList;
import java.util.List;

public class Election {

    public static int whoIsElected(int n, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int temp = 0;
        k = k - 1;
        while (list.size() != 1) {
            temp = (temp + k) % list.size();
            list.remove(temp);

        }
        return list.get(0);
    }

    public static void main(String[] args) {

        System.out.println(whoIsElected(4, 2));

    }
}
