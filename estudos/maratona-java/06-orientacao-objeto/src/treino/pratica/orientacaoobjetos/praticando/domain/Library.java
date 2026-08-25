package treino.pratica.orientacaoobjetos.praticando.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final int LOAN_DAYS = 15;
    private List<Book> books = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void registerBook(Book book) {
        books.add(book);
    }

    public Loan loanBook(Book book, Person person) {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Book is already borrowed");
        }
        LocalDate borrowDate = LocalDate.now();
        LocalDate expectedReturnDate = borrowDate.plusDays(LOAN_DAYS);
        Loan loan = new Loan(book, person, borrowDate, expectedReturnDate);
        book.markAsBorrowed();
        loans.add(loan);
        return loan;
    }

    public void returnBook(Loan loan) {
        loan.getBook().markAsAvailable();
        loans.remove(loan);
    }
}
