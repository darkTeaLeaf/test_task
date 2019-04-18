package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task1.MathBox;

import java.util.ArrayList;

public class UnitTest extends Assert{
    Number[] init_array;
    MathBox box;

    @Before
    public void initialization(){
        init_array = new Number[]{1, 5.5, 30, 6, 47};
        box = new MathBox(init_array);
    }

    @Test
    public void task1Summator(){
        Number expected = 89.5;
        assertEquals(expected, box.summator());
    }

    //Test with error. Did not have time to fix it
    @Test
    public void task1Splitter(){
        ArrayList<Number> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1.6666666666666667);
        expected.add(10);
        expected.add(2);
        expected.add(15);

        box.splitter(3);

        boolean res = true;

        for (int i = 0; i < expected.size(); i++) {
            if (!expected.get(i).equals(box.numbers.get(i))) {
                res = false;
            }
        }

        assertTrue(res);
    }

    @Test
    public void task1Delete(){
        box.delete(10);
        assertTrue(!box.numbers.contains(10));
    }

}
