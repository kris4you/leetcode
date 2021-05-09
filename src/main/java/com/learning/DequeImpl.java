package com.learning;

public class DequeImpl {

    int[] element = new int[5];
    int front = -1, rear = -1;
    int length = element.length;

    void addFirst(int x) {

        if (front == -1 && rear == -1) {
            front = rear = 0;
            element[front] = x;
        } else if (front == 0) {
            front = length - 1;
            element[front] = x;
        } else {
            front--;
            element[front] = x;
        }
    }

    void removeLast(int x) {

    }

    void removeFirst(int x) {

    }

    void peekFirst(int x) {

    }

    void peekLast(int x) {

    }

    void addLast(int x) {

        if (front == -1 && rear == -1) {
            front = rear = 0;
            element[rear] = x;
        } else if (rear == length - 1) {
            rear = 0;
            element[rear] = x;
        } else {
            rear++;
            element[rear] = x;
        }
    }

    void display() {

        int i = front;
        while (i != rear) {

            System.out.println(element[i]);
            i = (i + 1) % length;
        }
        System.out.println(element[rear]);
    }

    public static void main(String[] args) {
        DequeImpl dequeImpl = new DequeImpl();
        dequeImpl.addFirst(10);
        dequeImpl.addLast(20);
        dequeImpl.display();
    }
}
