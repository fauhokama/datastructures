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
        assertEquals(1, da.get(0));
    }

    @Test
    public void testAddTwoElements() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        assertEquals(1, da.get(0));
        assertEquals(2, da.get(1));
    }

    @Test
    public void testDuplicateLength() {
        DynamicArray da = new DynamicArray();
        assertEquals(1, da.getLength());
        assertEquals(0, da.getNumberOfElements());
        da.add(1);
        assertEquals(1, da.getLength());
        assertEquals(1, da.getNumberOfElements());
        da.add(2);
        assertEquals(2, da.getLength());
        assertEquals(2, da.getNumberOfElements());
        da.add(3);
        assertEquals(4, da.getLength());
        assertEquals(3, da.getNumberOfElements());
        da.add(4);
        assertEquals(4, da.getLength());
        assertEquals(4, da.getNumberOfElements());

        assertEquals(1, da.get(0));
        assertEquals(2, da.get(1));
        assertEquals(3, da.get(2));
        assertEquals(4, da.get(3));
    }
}