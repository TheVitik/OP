import java.util.Objects;

public class ElectronicArticle extends Article {
    private int soundid;
    private String videourl;
    public ElectronicArticle(String author,String date, int pages, String font, int symbols, int soundid,String videourl){
        super(author,date,pages,font,symbols);
        this.soundid=soundid;
        this.videourl=videourl;
    }
    public void StartRead(){
        System.out.println("You are reading an electronic article.");
    }
    public void StartRead(int page){
        System.out.println("You are reading an electronic article on page "+page);
    }
    public void Read(int count){
        if (count<this.pages) {
            System.out.println("You have read " + count + " pages.");
        }
        else if(count==this.pages){
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
    public int getSoundID(){
        return soundid;
    }
    public String getVideoURL(){
        return videourl;
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

