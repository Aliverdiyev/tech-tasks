package homework6;

public class Main {
    public static void main(String[] args) {
        Library<Library.Section> library = new Library<>();

// Sections
        Library.Section fiction = new Library.Section("Fiction");
        Library.Section science = new Library.Section("Science");

// Create books
        Library<Library.Section>.Book b1 = library.new Book("The Martian", "Andy Weir", 2011);
        Library<Library.Section>.Book b2 = library.new Book("Project Hail Mary", "Andy Weir", 2021);
        Library<Library.Section>.Book b3 = library.new Book("A Brief History of Time", "Stephen Hawking", 1988);

// Add books to sections
        fiction.addBook(b1);
        fiction.addBook(b2);
        science.addBook(b3);

// Add sections to library
        library.addSection(fiction);
        library.addSection(science);

// Display all sections
        library.displayAllSections();

// Filter books using anonymous class: only books after 2015
        library.filterBooks(new Library.BookFilter() {
            @Override
            public boolean filter(Library<?>.Book book) {
                return book.getYear() > 2015;
            }
        });
    }
}