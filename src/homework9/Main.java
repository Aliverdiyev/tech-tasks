package homework9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//  Books
        Book book1 = new Book("1984", "George Orwell", 1949, 4.9, true);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945, 4.8, false);
        Book book3 = new Book("Clean Code", "Robert Martin", 2008, 4.7, true);
        Book book4 = new Book("Effective Java", "Joshua Bloch", 2018, 4.9, true);
        Book book5 = new Book("The Pragmatic Programmer", "Andy Hunt", 1999, 4.6, true);
        Book book6 = new Book("Java Concurrency in Practice", "Brian Getz", 2006, 4.5, false);
        List<Book> books = Arrays.asList(book1, book2, book3, book4, book5, book6);

//  Users
        User user1 = new User("Aydin", 25, Arrays.asList(
                new BorrowRecord(book1, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 10)),
                new BorrowRecord(book3, LocalDate.of(2025, 10, 5), null)
        ));
        User user2 = new User("Leyla", 22, Arrays.asList(
                new BorrowRecord(book4, LocalDate.of(2025, 10, 2), LocalDate.of(2025, 10, 20)),
                new BorrowRecord(book6, LocalDate.of(2025, 10, 12), null)
        ));
        User user3 = new User("Murad", 28, Arrays.asList(
                new BorrowRecord(book5, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 25))
        ));
        List<User> users = Arrays.asList(user1, user2, user3);


    }
}