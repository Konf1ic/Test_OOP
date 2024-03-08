package Bai4;

public class ScienceBook extends NonFictionBook {

    private String scienceField;

    public ScienceBook(String title, String author, String publisher, String subject, String scienceField) {
        super(title, author, publisher, subject);
        this.scienceField = scienceField;
    }

    public String scienceField() {
        return scienceField;
    }

    public void scienceField(String scienceField) {
        this.scienceField = scienceField;
    }

    @Override
    public String toString() {
        return "ScienceBook{" +
                "scienceField='" + scienceField + '\'' +
                '}';
    }
}