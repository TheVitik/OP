import java.util.Comparator;

public class Article {
    protected int symbols;
    protected String author;
    public Article(String author,int symbols){
        this.author=author;
        this.symbols=symbols;
    }
    public String getAuthor(){
        return author;
    }
    public int getSymbols(){return symbols;}
    @Override
    public String toString(){
        return author+" "+symbols;
    }
    static class ArticleComparator implements Comparator<Article> {
        @Override
        public int compare(Article o1, Article o2) {
            if (o1.getAuthor().compareTo(o2.getAuthor())==0) {
                return Integer.compare(o1.getSymbols(), o2.getSymbols());
            } else {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        }
    }
}
