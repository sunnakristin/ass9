package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

import is.hi.hbv202g.ass9.compositeObserved.Observer;

public class MultiplyComposite implements MathExpression, Observer {

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

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
