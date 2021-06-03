import java.util.Objects;

public class ElectronicArticle extends Article {
    private int soundid;
    public ElectronicArticle(String author, int symbols, int soundid){
        super(author,symbols);
        this.soundid=soundid;
    }
    public int getSoundID(){
        return soundid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicArticle that = (ElectronicArticle) o;
        return symbols == that.symbols &&
                Objects.equals(author, that.author);
    }
}

