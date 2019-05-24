public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Book book = new Book("tontiş", 123, new BookPersistence());

        book.print();

        book.save();


    }
}
