package homework4;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert.C.Martin", "1234567890");

        book1.printInfo();
        book1.borrowBook();
        book1.returnBook();
        Book.libraryRules();
        book1.bookType();
    }
}