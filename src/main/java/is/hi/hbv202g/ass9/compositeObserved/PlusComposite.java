package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {

    private int lastObservedField;
    private List<MathExpression> list = new ArrayList<>();

    public void add(MathExpression mathExpression) {
        list.add(mathExpression);
    }

    public int getResult() {
        int result = 0;
        for (MathExpression mathExpression : list) {
            result += mathExpression.getResult();
        }
        return result;
    }

    public void update() {
        lastObservedField = getResult();
        System.out.println(lastObservedField);
    }

    public int getLastObservedField() {
        return lastObservedField;
    }
}
