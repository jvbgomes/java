package treino.pratica.orientacaoobjetos.praticando.domain;

import java.time.LocalDate;

public class Loan {
    private final Person person;
    private final Book book;
    private final LocalDate borrowDate;
    private final LocalDate expectedReturnDate;

    public Loan(Book book, Person person, LocalDate borrowDate, LocalDate expectedReturnDate) {
        this.person = person;
        this.book = book;
        this.borrowDate = borrowDate;
        this.expectedReturnDate = expectedReturnDate;
    }

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getExpectedReturnDate() {
        return expectedReturnDate;
    }
}
