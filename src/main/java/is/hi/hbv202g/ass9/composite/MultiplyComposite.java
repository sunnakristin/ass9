package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

import is.hi.hbv202g.ass9.compositeObserved.Observer;

public class MultiplyComposite implements MathExpression, Observer {

    private int lastObservedField;
    private List<MathExpression> list = new ArrayList<>();

    public void add(MathExpression mathExpression) {
        list.add(mathExpression);
    }

    public int getResult() {
        int result = 1;
        for (MathExpression mathExpression : list) {
            result *= mathExpression.getResult();
        }
        return result;
    }
    public void update() {
        lastObservedField = getResult();
        System.out.println(lastObservedField);
    }

    public int getLastObservedResult() {
        return lastObservedField;
    }

}
