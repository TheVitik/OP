import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        PaperArticle[] articles = new PaperArticle[4];
        articles[0] = new PaperArticle("Viktor",3200);
        //articles[1] = new ElectronicArticle("Nikita","29.11.2020",10,"Calibri",7382,18,"/videos/article1/news.mp4");
        articles[1] = new PaperArticle("Evgeniy",1444);
        articles[2] = new PaperArticle("Admin",1242);
        PaperArticle.ArticleComparator acomp = new PaperArticle.ArticleComparator();
        TreeSet<PaperArticle> treeset = new TreeSet<PaperArticle>(acomp);
        treeset.addAll(Arrays.asList(articles));
        for (PaperArticle i:treeset){
            System.out.println(i.getAuthor() + " " + i.getSymbols());
        }
    }
}
