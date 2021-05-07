package com.learning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortSegments {

    public static void main(String[] args) {

        /***
         *
         * place the segments with start point in hashmap place all the segments with
         * end point in hashmap add all the points to deque
         */

        List<Point> points = new ArrayList<>();
        points.add(new Point(4, 5));
        points.add(new Point(9, 4));
        points.add(new Point(5, 1));
        points.add(new Point(11, 9));

        Map<Integer, Point> startMap = points.stream().collect(Collectors.toMap(m -> m.getX(), x -> x));
        Map<Integer, Point> endMap = points.stream().collect(Collectors.toMap(m -> m.getY(), y -> y));

        System.out.println(startMap);
        System.out.println(endMap);

        Deque<Point> pointQueue = new ArrayDeque<>();
        pointQueue.addLast(points.get(0));
        Integer startPoistion = points.get(0).getX();
        Integer endPosition = points.get(0).getY();

        while (startMap.get(endPosition) != null || endMap.get(startPoistion) != null) {

            Point srcEndpoint = startMap.get(endPosition);
            Point destEndpoint = endMap.get(startPoistion);

            if (srcEndpoint != null)
                pointQueue.addLast(srcEndpoint);
            if (destEndpoint != null)
                pointQueue.addFirst(destEndpoint);

            if (pointQueue.getFirst() != null) {
                startPoistion = pointQueue.getFirst().getX();
            }

            if (pointQueue.getLast() != null) {
                endPosition = pointQueue.getLast().getY();
            }
        }

        System.out.println(pointQueue);
    }

    static class Point {

        Integer x;
        Integer y;

        Point(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + " " + y + ")";
        }
    }
}
