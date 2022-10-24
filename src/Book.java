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
    public void setPublished( int published) {
        this.published = published;
    }
}


