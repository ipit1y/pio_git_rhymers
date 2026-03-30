package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    private final int[] numbers = new int[MAX_SIZE];
    public static final int DEFAULT_RETURNING_VALUE = -1;
    private int total = EMPTY;


    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getTotal() {
        return total;
    }
    
    public boolean isFull() {
        return total == MAX_SIZE+EMPTY;
    }

    protected int peek() {
        if (isEmpty())
            return DEFAULT_RETURNING_VALUE;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURNING_VALUE;
        return numbers[total--];
    }

}
