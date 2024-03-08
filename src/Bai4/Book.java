package Bai4;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public String getInfo() {
        return "Tiêu đề: " + title + "\n" +
                "Tác giả: " + author + "\n" +
                "Nhà xuất bản: " + publisher;
    }
}

class Main {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K. Rowling", "Bloomsbury");
        System.out.println(book.getInfo());

        FictionBook fictionBook = new FictionBook("Lord of the Rings", "Tolkien", "H.M.H", "Fantasy");
        System.out.println(fictionBook.getInfo());

        NonFictionBook nonFictionBook = new NonFictionBook("All in Her Head", "Elizabeth Comen", "........", "Life");
        System.out.println(nonFictionBook.getInfo());

        ScienceBook scienceBook = new ScienceBook("A Brief History of Time", "Stephen Hawking", "Bantam Books", "Cosmology", "Physics");
        System.out.println(scienceBook.getInfo());
    }
}