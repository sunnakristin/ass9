package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeMathExpression implements MathExpression, Observer {
    protected List<MathExpression> children = new ArrayList<>();

    public void add(MathExpression child) {
        children.add(child);
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println("Updated Result: " + lastObservedResult);
    }

    public abstract int getResult();

    protected int lastObservedResult;
}
