package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

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

}
