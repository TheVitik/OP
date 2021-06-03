import java.util.Comparator;
import java.util.Objects;

public class PaperArticle extends Article {
    public PaperArticle(String author, int symbols){
        super(author,symbols);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaperArticle that = (PaperArticle) o;
        return symbols == that.symbols &&
                Objects.equals(author, that.author);
    }
}
