package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] numbers = new int[12];

    private int total = -1;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == -1;
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
