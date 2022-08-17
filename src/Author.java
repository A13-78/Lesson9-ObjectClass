import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorPatronymic;
    private final String authorSurname;

    public Author(String authorName, String authorPatronymic, String authorSurname) {
        this.authorName = authorName;
        this.authorPatronymic = authorPatronymic;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName + " " + authorPatronymic + " " + authorSurname;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    @Override
    public String toString() {
        return "Автор: " + " " + authorName + " " + authorPatronymic + " " + authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorPatronymic.equals(author.authorPatronymic) && authorSurname.equals(author.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorPatronymic, authorSurname);
    }
}




