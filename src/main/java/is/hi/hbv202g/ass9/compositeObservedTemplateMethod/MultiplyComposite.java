package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {

    private int lastObservedResult;
    private List<MathExpression> list = new ArrayList<>();

    public MultiplyComposite() {
    }

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
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
