package edu.kis.vh.nursery;

/**
 * FifoRhymer to klasa implementująca mechanizm kolejki FIFO.
 * Wykorzystuje pomocniczy stos do odwrócenia kolejności elementów.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Usuwa i zwraca element z początku kolejki.
     *
     * @return Zwraca wartość elementu, który był najdłużej w kolejce, lub -1 jeśli kolejka jest pusta.
     */
    @Override
    public int pop() {
        while (!isEmpty())
            temp.push(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())
            push(temp.pop());

        return ret;
    }

    /**
     * Zwraca obiekt pomocniczego stosu używanego do operacji FIFO.
     *
     * @return Obiekt DefaultCountingOutRhymer używany jako bufor tymczasowy.
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
