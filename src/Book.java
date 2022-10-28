import java.util.Objects;

public class Book {
    private String bookName;
    private int published;
    public Book (String bookName, int published) {
        this.bookName = bookName;
        this.published = published;
    }
    public String getBookName (){
        return this.bookName;
    }

    public int getPublished() {
        return this.published;
    }

    public String toString() {
     return "Название книги " + this.bookName + " Опубликована в " + this.published;
    }

    @Override
    public boolean equals(Object other) {
        if (this.bookName == other) return true;
        if (getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}


