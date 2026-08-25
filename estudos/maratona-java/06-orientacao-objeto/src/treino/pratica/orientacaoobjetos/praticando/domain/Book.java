package treino.pratica.orientacaoobjetos.praticando.domain;

public class Book {
    private final String title;
    private final int pages;
    private final Author author;
    private boolean available;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markAsBorrowed() {
        this.available = false;
    }

    public void markAsAvailable() {
        this.available = true;
    }
}
