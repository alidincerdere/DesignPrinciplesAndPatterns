/**
 * Created by adere on 24.05.2019.
 */
public class Book implements BookHandler {

    private String authorname;

    private int numOfPages;

    private BookPersistence bookPersistence;

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

    public Book(String authorname, int numOfPages, BookPersistence bookPersistence) {
        this.authorname = authorname;
        this.numOfPages = numOfPages;
        this.bookPersistence = bookPersistence;
    }

    @Override
    public void print() {
        System.out.println("Printing the book ...");
    }

    @Override
    public void save() {

        bookPersistence.save(this);
    }
}
