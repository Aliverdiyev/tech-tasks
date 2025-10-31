package homework6;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {
    private final List<T> sections = new ArrayList<>();

    public void addSection(T section) {
        sections.add(section);
    }

    public void displayAllSections() {
        for (T section : sections) {
            System.out.println("Section: " + section.getName());
            section.displayBooks();
        }
    }

    // Non-static inner class Book
    public class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Book{title='" + this.title + "', author='" + this.author + "', year=" + this.year + "}";
        }
    }

    // Static nested class Section
    public static class Section {
        private final String name;
        final List<Library<?>.Book> books = new ArrayList<>();

        public Section(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void addBook(Library<?>.Book book) {
            books.add(book);
        }

        public void displayBooks() {
            for (Library<?>.Book b : books) {
                System.out.println(" - " + b.toString());
            }
        }
    }

    // BookFilter interface
    public interface BookFilter {
        boolean filter(Library<?>.Book book);
    }

    // filterBooks method
    public void filterBooks(BookFilter filter) {
        System.out.println("Filtered books (based on filter condition):");
        for (T section : sections) {
            for (Library<?>.Book b : section.books) {
                if (filter.filter(b)) {
                    System.out.println(" - " + b.toString());
                }

            }
        }
    }
}