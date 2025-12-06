package homework9;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryService {
    private List<Book> books;
    private List<User> users;

    public LibraryService(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    //    2. Lambda and Comparator chaining
//    Sorting books:
    public void sortBooks() {
        Comparator<Book> bookComparator = Comparator
                .comparing(Book::getRating).reversed() // First, in descending order of rating
                .thenComparing(Book::getYear) // In ascending order by year
                .thenComparing(Book::getTitle); // alphabetically by title

        List<Book> sortedBooks = books.stream()
                .sorted(bookComparator)
                .toList();

        System.out.println("Sorted Books:");
        sortedBooks.forEach(System.out::println);
    }

    //    3. Stream API — Deep Analytics
//    Perform library-level analyses:
    public void analyzeLibrary() {
        System.out.println("Library Analysis:");
//  1. Find the average rating of all books:
        OptionalDouble avgRating = books.stream()
                .mapToDouble(Book::getRating)
                .average();
        System.out.println("Average Rating: " + avgRating);

//  2. Lists books written after 2000 that are currently available:
        List<Book> availableAfter2000 = books.stream()
                .filter(book -> book.getYear() > 2000)
                .filter(Book::isAvailable)
                .toList();
        System.out.println("Available after 2000: " + availableAfter2000);

        //  3. ?
        // 4. ?

//  5 .Group all books by author, but only include books published after 1950:
        Map<String, List<Book>> byAuthorAfter1950 = books.stream()
                .filter(book -> book.getYear() > 1950)
                .collect(Collectors.groupingBy(Book::getAuthor));

        System.out.println("Books grouped by author (after 1950):");
        byAuthorAfter1950.forEach((author, bookList) -> System.out.println(author + " -> " + bookList));
    }
}
