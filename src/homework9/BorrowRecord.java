package homework9;

import java.time.LocalDate;

public class BorrowRecord {
    private Book book;
    private LocalDate borrowedDate;
    private LocalDate returnedDate;

    BorrowRecord(Book book, LocalDate borrowedDate, LocalDate returnedDate) {
        this.book = book;
        this.borrowedDate = borrowedDate;
        this.returnedDate = returnedDate;
    }

    //    Getters
    public Book getBook() {
        return book;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }

    //    Setters
    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
    }

    public boolean isReturned() {
        return returnedDate != null;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book.getTitle() +
                ", borrowedDate=" + borrowedDate +
                ", returnedDate=" + returnedDate +
                '}';
    }
}