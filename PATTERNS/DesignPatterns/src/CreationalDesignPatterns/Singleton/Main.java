package CreationalDesignPatterns.Singleton;

/**
 * Created by adere on 28.06.2019.
 */
public class Main {


    public static void main(String[] args) {

        Downloader d1 = Downloader.getInstance();

        Downloader d2 = Downloader.getInstance();

        if (d1 == d2)
            System.out.println("They are same");

        d1.startDownloading();

    }





}
