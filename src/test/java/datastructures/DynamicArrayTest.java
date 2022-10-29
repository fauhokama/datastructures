package datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * ArrayList
 */
public class DynamicArrayTest {

    @Test
    public void testAddOneElement() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        assertEquals(da.get(0), 1);
    }

    @Test
    public void testAddTwoElements() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        assertEquals(da.get(0), 1);
        assertEquals(da.get(1), 2);
    }
}