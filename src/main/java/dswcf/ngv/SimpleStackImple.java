package dswcf.ngv;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Mes documents on 05/12/2016.
 */
public class SimpleStackImple implements SimpleStack {
    Stack<Object> sta= new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return sta.isEmpty();
    }

    @Override
    public int getSize() {
        return sta.size();
    }

    @Override
    public void push(Item item) {
        sta.push(item);

    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) sta.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) sta.pop();
    }
}
