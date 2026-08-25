package treino.pratica.orientacaoobjetos.praticando.test;

import treino.pratica.orientacaoobjetos.praticando.domain.Author;
import treino.pratica.orientacaoobjetos.praticando.domain.Book;
import treino.pratica.orientacaoobjetos.praticando.domain.BookNotAvailableException;
import treino.pratica.orientacaoobjetos.praticando.domain.Library;
import treino.pratica.orientacaoobjetos.praticando.domain.Loan;
import treino.pratica.orientacaoobjetos.praticando.domain.Person;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("JK Rowling", "Harry Potter");
        Book book1 = new Book("Harry Potter and the Deathly Hallows", 500, author1);

        Person person1 = new Person("John");
        Person person2 = new Person("Mary");

        Library library = new Library();
        library.registerBook(book1);

        Loan loan = library.loanBook(book1, person1);
        System.out.println("Book borrowed: " + loan.getBook().getTitle());
        System.out.println("Borrowed by: " + loan.getPerson().getName());
        System.out.println("Expected return: " + loan.getExpectedReturnDate());

        try {
            library.loanBook(book1, person2);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        library.returnBook(loan);
        System.out.println("Book returned. Available: " + book1.isAvailable());
    }
}
