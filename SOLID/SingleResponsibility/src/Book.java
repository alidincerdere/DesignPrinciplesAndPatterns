/**
 * Created by adere on 24.05.2019.
 */
public class Book {

    private String authorname;

    private int numOfPages;

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public Book(String authorname, int numOfPages) {
        this.authorname = authorname;
        this.numOfPages = numOfPages;
    }

    public void printAndSave() {
        System.out.println("Printing the book ...");
        System.out.println("Saving the book ...");
    }
}
