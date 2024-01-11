package iterator.exercise2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return bookShelf.getSize() > 0;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return bookShelf.getBook();
    }
}
