package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import is.hi.hbv202g.ass9.composite.MathExpression;

public class NumberLeaf extends Observable implements MathExpression {

    private int i;

    public NumberLeaf(int i) {
        this.i = i;
    }

    public int getResult() {
        return i;
    }

    public void setValue(int i) {
        this.i = i;
        notifyObservers();
    }

}
