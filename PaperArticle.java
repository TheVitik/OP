import java.util.Objects;

public class PaperArticle extends Article {
    public PaperArticle(String author,String date, int pages, String font, int symbols){
        super(author,date,pages,font,symbols);
    }
    public void StartRead(){
        System.out.println("You are reading a paper article.");
    }
    public void StartRead(int page){
        System.out.println("You are reading a paper article on page "+page);
    }
    public void Read(int count){
        if (count<super.pages) {
            System.out.println("You have read " + count + " pages.");
        }
        else if(count==super.pages){
            System.out.println("You have read this article.");
        }
        else{
            if(count<0){
                System.out.println("How is this possible?");
            }
            else {
                System.out.println("This article does not contain "+count+" pages.");
            }
        }
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
