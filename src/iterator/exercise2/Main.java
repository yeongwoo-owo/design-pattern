package iterator.exercise2;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Around the World in 80 Days"));
        bookShelf.addBook(new Book("Bible"));
        bookShelf.addBook(new Book("Cinderella"));
        bookShelf.addBook(new Book("Daddy-Long-Legs"));

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
