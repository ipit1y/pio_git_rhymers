package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int SIZE = 12;
    public static final int EMPTY = -1;
    private int[] numbers = new int[SIZE];

    private int total = EMPTY;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peek() {
        if (isEmpty())
            return -1;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return -1;
        return numbers[total--];
    }

}
