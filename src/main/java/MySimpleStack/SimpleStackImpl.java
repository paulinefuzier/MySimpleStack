package MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {
    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty() {
        return false;
    }

    public int getSize() {
        return 0;
    }

    public void push(Item item) {

    }

    public Item peek() throws EmptyStackException {
        return null;
    }

    public Item pop() throws EmptyStackException {
        return null;
    }
}
