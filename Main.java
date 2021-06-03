import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Article[] articles = new Article[4];
        articles[0] = new PaperArticle("Viktor",3200);
        articles[1] = new ElectronicArticle("Nikita",7382,10);
        articles[2] = new PaperArticle("Evgeniy",1444);
        articles[3] = new PaperArticle("Admin",1242);
        Article.ArticleComparator acomp = new Article.ArticleComparator();
        TreeSet<Article> treeset = new TreeSet<Article>(acomp);
        treeset.addAll(Arrays.asList(articles));
        for (Article i:treeset){
            System.out.println(i.getAuthor() + " " + i.getSymbols());
        }
        Comparator<Article> comp = new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                return Integer.compare(o1.getSymbols(), o2.getSymbols());
            }
        };
        Arrays.sort(articles,comp);
        for (Article i:articles){
            System.out.println(i.getSymbols() + " " + i.getAuthor());
        }
    }
}
