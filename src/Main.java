public class Main {

        public static void main(String[] args) {

                Book book = new Book("The Silmarillion", 1977);
                System.out.println("book.bookName = " + book.getBookName());
                System.out.println("book.published = " + book.getPublished());



                Author author = new Author("John.R.R", "Tolkien");
                System.out.println("author.firstName = " + author.getFirstName());
                System.out.println("author.secondName = " + author.getSecondName());

                System.out.println(book);
                System.out.println(author);

        }

        }

