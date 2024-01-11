package iterator.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BookShelf implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBook() {
        int index = new Random().nextInt(books.size());
        Book book = books.get(index);
        books.remove(book);
        return book;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getSize() {
        return books.size();
    }
}
