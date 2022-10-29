package datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testRemoveFirstElement() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        Boolean found = da.remove(1);

        assertTrue(null, found);
        assertEquals(2, da.get(0));
    }

    @Test
    public void testRemoveLastElement() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        Boolean found = da.remove(2);

        assertTrue(null, found);
        assertEquals(1, da.get(0));
    }

    @Test
    public void testRemoveNotFound() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        Boolean found = da.remove(3);

        assertFalse(null, found);
        assertEquals(1, da.get(0));
        assertEquals(2, da.get(1));
    }

    @Test
    public void testRemoveAndAdd() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.remove(1);
        da.remove(2);
        da.add(3);

        assertEquals(3, da.get(0));
    }

    @Test
    public void testInsertAtBeggining() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);

        da.insert(3, 0);

        assertEquals(3, da.get(0));
        assertEquals(1, da.get(1));
        assertEquals(2, da.get(2));
    }

    @Test
    public void testInsertAtMiddle() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);

        da.insert(3, 1);

        assertEquals(1, da.get(0));
        assertEquals(3, da.get(1));
        assertEquals(2, da.get(2));
    }

    @Test
    public void testInsertAtEnd() {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);

        da.insert(3, 2);

        assertEquals(1, da.get(0));
        assertEquals(2, da.get(1));
        assertEquals(3, da.get(2));
    }

    @Test
    public void testSearchFound() {
        DynamicArray da = new DynamicArray();

        da.add(1);
        da.add(2);

        assertEquals(0, da.search(1));
        assertEquals(1, da.search(2));
    }

    @Test
    public void testSearchNotFound() {
        DynamicArray da = new DynamicArray();

        da.add(1);
        da.add(2);

        assertEquals(-1, da.search(3));
    }
}