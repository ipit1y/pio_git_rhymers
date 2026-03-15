package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer dCOR = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            dCOR.countIn(super.countOut());

        int ret = dCOR.countOut();

        while (!dCOR.callCheck())
            countIn(dCOR.countOut());

        return ret;
    }
}
