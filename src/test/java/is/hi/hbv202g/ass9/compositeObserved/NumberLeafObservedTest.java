package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.Assert.*;

import java.util.Observable;
import java.util.Observer;

import org.junit.Before;
import org.junit.Test;

import is.hi.hbv202g.ass9.composite.NumberLeaf;

public class NumberLeafObservedTest implements Observer {

	private int lastObservedResult;
	private NumberLeaf number1;

	@Before
	public void setUp() {
		lastObservedResult=0; // This value here must be different than the one set in the next line
		number1 = new NumberLeaf(1);
	}

	@Test
	public void testAttachAndUpdateAfterSetValue() {
		number1.attach(this);
		number1.setValue(3);

		assertEquals("A leaf observed by this testcase should call update method of this testcase after having " +
						"set value of this leaf to 3 and this leaf should returns this new value 3 when asked by the update method",
				3, lastObservedResult);
	}

	@Override
	public void update() { // We need to provide this method according to the Observer interface that this test class implements
		lastObservedResult=number1.getResult(); // If we get called we store the value in lastObservedResult so that the test case above can assert on it
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}
}