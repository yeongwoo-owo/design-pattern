package iterator.exercise.book;

import iterator.exercise.linkedlist.LinkedList;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private LinkedList<Book> books;

    public BookShelf() {
        this.books = new LinkedList<>();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(books.getHead());
    }

    public void appendBook(Book book) {
        books.insert(book);
    }
}
