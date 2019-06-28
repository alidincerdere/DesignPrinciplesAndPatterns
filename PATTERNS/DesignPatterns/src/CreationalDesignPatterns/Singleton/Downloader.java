package CreationalDesignPatterns.Singleton;

/**
 * Created by adere on 28.06.2019.
 */
public class Downloader {

    private static Downloader instance;

    private Downloader() {

    }

    public void startDownloading() {
        System.out.println("Start Downloading ...");
    }

    public static Downloader getInstance() {

        if (instance == null)
            instance = new Downloader();

        return instance;
    }
}
