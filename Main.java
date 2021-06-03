
public class Main {
    public static void main(String[] args){
        PaperArticle particle = new PaperArticle("Viktor","29.11.2020",4,"Arial",3200);
        System.out.println("-------Paper Article-------");
        System.out.println(particle.toString());
        particle.StartRead();
        particle.Read(3);
        particle.setAuthor("Admin");
        particle.setFont("Times New Roman");
        System.out.println(particle.toString());
        System.out.println("-------Electronic Article-------");
        ElectronicArticle earticle = new ElectronicArticle("Operator","29.11.2020",10,"Calibri",7382,18,"/videos/article1/news.mp4");
        System.out.println(earticle.toString());
        System.out.println("This article contains a sound with id "+earticle.getSoundID()+" and video with address "+earticle.getVideoURL()+".");
        earticle.StartRead(6);
        earticle.Read(10);
        System.out.println(particle.equals(earticle));
    }
}
