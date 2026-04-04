package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;
public class FifoRhymerTest {
    @Test
    public void testFifoBehavior() {
        FifoRhymer fifo = new FifoRhymer();
        fifo.push(10);
        fifo.push(20);
        fifo.push(30);

        Assert.assertEquals(10, fifo.pop());
        Assert.assertEquals(20, fifo.pop());
        Assert.assertEquals(30, fifo.pop());
    }

    @Test
    public void testIsEmpty() {
        FifoRhymer fifo = new FifoRhymer();
        Assert.assertTrue(fifo.isEmpty());
        fifo.push(1);
        Assert.assertFalse(fifo.isEmpty());
    }
}
