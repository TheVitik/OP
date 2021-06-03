import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        //Додаємо в масив 4 об'єкта статей
        Article[] articles = new Article[4];
        articles[0] = new PaperArticle("Viktor",3200);
        articles[1] = new ElectronicArticle("Nikita",7382,10);
        articles[2] = new PaperArticle("Evgeniy",1444);
        articles[3] = new PaperArticle("Admin",1242);
        //Створюємо екземпляр компаратор
        Article.ArticleComparator acomp = new Article.ArticleComparator();
        //Створюємо екземпляр TreeSet і передаємо компаратор
        TreeSet<Article> treeset = new TreeSet<Article>(acomp);
        //Заповнюємо TreeSet елементами масиву
        treeset.addAll(Arrays.asList(articles));
        //Вивід
        for (Article i:treeset){
            System.out.println(i.getAuthor() + " " + i.getSymbols());
        }
        //Створюємо анонімний компаратор, що доступний лише в методі main
        Comparator<Article> comp = new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                //Порівнюємо лише за калькістю символів (я захотів сортувати лише за ними)
                return Integer.compare(o1.getSymbols(), o2.getSymbols()); 
            }
        };
        //Сортуємо за допомогою компаратора
        Arrays.sort(articles,comp);
        //Вивід
        for (Article i:articles){
            System.out.println(i.getSymbols() + " " + i.getAuthor());
        }
    }
}
