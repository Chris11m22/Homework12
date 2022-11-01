import java.util.Objects;

public class Author {
    String firstName;
    String secondName;

    public Author (String firstName,String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondName);
    }

    public String toString() {
        return "Имя " + this.firstName + " Фамилия " + this.secondName;


    }

}
