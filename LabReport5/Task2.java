class LibraryBook {
    private String title;
    private String author;
    private String bookID;

    public LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", "BK-1001");
        LibraryBook book2 = new LibraryBook("1984", "George Orwell", "BK-1002");

        System.out.println("--- Library Book Records ---");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
