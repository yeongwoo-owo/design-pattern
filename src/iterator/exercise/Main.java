package iterator.example;

import iterator.example.book.Book;
import iterator.example.book.BookShelf;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // 명시적 Iterator 사용
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

        // 확장 for문을 통한 암묵적 Iterator 사용
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}
