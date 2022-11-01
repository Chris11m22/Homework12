import java.util.Objects;

public class Main {

        public static void main(String[] args) {

                Book book = new Book("The Silmarillion", "John.R.R.Tolkien", 1977);
                System.out.println("book.bookName = " + book.getBookName());
                System.out.println("book.published = " + book.getPublished());

                System.out.println(book);
                Book theSilmarillion = new Book("The Silmarillion", "John.R.R.Tolkien", 1977);
                Book theSilmarillion2 = new Book("The Silmarillion", "John.R.R.Tolkien", 1977);
                System.out.println("Book equal " + theSilmarillion.equals(theSilmarillion2));
                System.out.println("Book equal " + (theSilmarillion.hashCode() == theSilmarillion2.hashCode()));

                Author author = new Author("John.R.R", "Tolkien");
                System.out.println("author.firstName = " + author.getFirstName());
                System.out.println("author.secondName = " + author.getSecondName());


                System.out.println(author);
                Author tolkien = new Author("John.R.R","Tolkien");
                Author tolkien2 = new Author("John.R.R", "Tolkien");
                System.out.println("Author equal " + tolkien.equals(tolkien2));
                System.out.println("Author equal " + (tolkien.hashCode() == tolkien2.hashCode()));


        }

        }

