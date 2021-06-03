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
            if(o1.getAuthor()!=null && o2.getAuthor()!=null
                    && o1.getAuthor().equals(o2.getAuthor())){
                if(o1.getSymbols()==o2.getSymbols())
                    return 0;
                else if(o1.getSymbols()>o2.getSymbols()){
                    return 1;
                }
            }
            return 1;
        }
    }
}
