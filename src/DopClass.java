public class DopClass {
    public static void main(String[] args) {
        Book book = new Book("The Silmarillion", 1977);
        book.setPublished(1990);
        System.out.println("book.getPublished() = " + book.getPublished());

    }
}
