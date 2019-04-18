package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task1.MathBox;

import java.util.ArrayList;

public class UnitTest extends Assert{
    Number[] init_array;
    MathBox box;
    MathBox box2;

    @Before
    public void initialization(){
        init_array = new Number[]{1, 5.5, 30, 6, 47};
        box = new MathBox(init_array);
        box2 = new MathBox(init_array);
    }

    @Test
    public void task1Summator(){
        Number expected = 89.5;
        assertEquals(expected, box.summator());
    }

    @Test
    public void task1Splitter(){
        ArrayList<Number> expected = new ArrayList<>();
        expected.add(1);
        expected.add(5.5);
        expected.add(30);
        expected.add(6);
        expected.add(47);

        box.splitter(3);

        boolean res = true;

        for (int i = 0; i < expected.size(); i++) {
            if (!expected.get(i).equals(box2.numbers.get(i))) {
                res = false;
                System.out.println(expected.get(i)+ " " + box2.numbers.get(i));
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
