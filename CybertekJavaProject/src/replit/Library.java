package replit;

public class Library {

    static int x = 0;

    public static void main(String[] args) {

        Book b = new Book(1, "StevEn GerrarD", "LIVERPOOL", 10);
        Shelf.addBook(b);
        System.out.println(Shelf.getTheBooks().size());
        Shelf.removeBook("Steven gerrard");
        System.out.println(Shelf.getTheBooks().size());
        System.out.println(Shelf.isShelfEmpty());



    }
}
