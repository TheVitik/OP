import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Article[] articles = new Article[4];
        articles[0] = new PaperArticle("Viktor",3200);
        //articles[1] = new ElectronicArticle("Nikita","29.11.2020",10,"Calibri",7382,18,"/videos/article1/news.mp4");
        articles[1] = new PaperArticle("Evgeniy",1444);
        articles[2] = new PaperArticle("Admin",1242);
        Article.ArticleComparator acomp = new Article.ArticleComparator();

        TreeSet<Article> treeset = new TreeSet<Article>(acomp);
        treeset.addAll(Arrays.asList(articles));
        for (Article i:treeset){
            System.out.println(i.getAuthor() + " " + i.getSymbols());
        }

    }
}
