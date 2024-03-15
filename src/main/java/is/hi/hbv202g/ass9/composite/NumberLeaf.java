package is.hi.hbv202g.ass9.composite;

import is.hi.hbv202g.ass9.composite.MathExpression;

public class NumberLeaf implements MathExpression {

    private int i;

    public NumberLeaf(int i) {
        this.i = i;
    }

    public int getResult() {
        return i;
    }

}
