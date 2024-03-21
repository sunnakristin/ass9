package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private int lastObservedResult;
    private List<MathExpression> list = new ArrayList<>();

    public PlusComposite() {

    }

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
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
