import java.util.Objects;

public abstract class Article {
    protected int pages;
    protected int symbols;
    protected String author;
    protected String font;
    protected String date;
    public Article(String author,String date, int pages, String font, int symbols){
        this.author=author;
        this.date=date;
        this.pages=pages;
        this.font=font;
        this.symbols=symbols;
    }
    public String getAuthor(){
        return author;
    }
    public String getDate(){
        return date;
    }
    public int getPages(){
        return pages;
    }
    public String getFont(){
        return font;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setDate(String date) {
        //Simple date checking(Only length of text)
        if (date.length() == 10 && (date.length() - date.replace(".", "").length())==2) {
            this.date = date;
        }
        else{
            System.out.println("Date is incorrect!");
        }
    }
    public void setPages(int pages){
        if (pages>=0){
            this.pages=pages;
        }
        else{
            System.out.println("How can be there "+pages+" pages?");
        }
    }

    public void setFont(String font){
        boolean activated = false;
        String[] fonts = new String[]{"Arial","Calibri","Times New Roman","Helvetica","Georgia"};
        for (String cfont : fonts){
            if(font.equals(cfont)) {
                this.font = font;
                activated = true;
            }
        }
        if (!activated){
            System.out.println("There is no such font in the database");
        }
    }
    public void StartRead(){
        System.out.println("You are reading an article.");
    }

    @Override
    public String toString(){
        return this.author+" is the author of this article, created "+ this.date+" using "+ this.font+" font. Consist of "+ this.pages+" pages and contains "+ this.symbols+" symbols.";
    }
}
