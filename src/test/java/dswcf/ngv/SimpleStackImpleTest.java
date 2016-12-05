package dswcf.ngv;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mes documents on 05/12/2016.
 */
public class SimpleStackImpleTest {

    SimpleStackImple s;

    @Before
    public void setUp() throws Exception {
        s = new SimpleStackImple();
        System.out.println("je suis executé avant chaque test");

    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true,s.isEmpty());
        Item item = new Item();
        s.push(item);
        Assert.assertEquals(false,s.isEmpty());

    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0,s.getSize());
        Item i = new Item();
        Item i2 = new Item();
        s.push(i);
        s.push(i2);
        Assert.assertEquals(2,s.getSize());

    }

    @Test
    public void push() throws Exception {
        Assert.assertEquals(0,s.getSize());
        Item item = new Item();
        s.push(item);
        Assert.assertEquals(1,s.getSize());
        Item itemTest = s.peek();
        Assert.assertEquals(item,itemTest);

    }

    @Test
    public void peek() throws Exception {
      Assert.assertEquals(0,s.getSize());
        Item ito = new Item();
        s.push(ito);
        Assert.assertEquals(1,s.getSize());
        Item it;
        it = s.peek();
        Assert.assertEquals(1,s.getSize());
    }

    @Test
    public void pop() throws Exception {
        Assert.assertEquals(0,s.getSize());
        Item ito = new Item();
        s.push(ito);
        Assert.assertEquals(1,s.getSize());
        Item it;
        it = s.pop();
        Assert.assertEquals(0,s.getSize());

    }

}