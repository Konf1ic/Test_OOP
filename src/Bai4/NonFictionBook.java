package Bai4;

public class NonFictionBook extends Book {

    private String subject;

    public NonFictionBook(String title, String author, String publisher, String subject) {
        super(title, author, publisher);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}