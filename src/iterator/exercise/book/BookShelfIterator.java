package iterator.exercise.book;


import iterator.exercise.linkedlist.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private Node<Book> cur;

    public BookShelfIterator(Node<Book> cur) {
        this.cur = cur;
    }

    @Override
    public boolean hasNext() {
        return cur.hasNext();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Book next = cur.getNext().getContent();
        cur = cur.getNext();
        return next;
    }
}
