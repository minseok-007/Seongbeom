package HW1;

public class LibraryMember {
    private String name;
    private String memberId;

    private Book borrowedBook;

    public LibraryMember (String name, String memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    public String getName(){
        return name;
    }

    public String getMemberId(){
        return memberId;
    }

    public Book borrowedBook() {
        return borrowedBook;
    }

    public void borrowBook(Book book){
        if(borrowedBook == null && !book.isBorrowed()) {
            borrowedBook = book;
            book.borrowBook();
            System.out.println(name + " borrowed " + book.getTitle());
        }else if (borrowedBook != null) {
            System.out.println("You already have borrowed a book.");
        } else {
            System.out.println(book.getTitle() + "is already borrowed");
        }
    }

    public void returnBook(){
        if(borrowedBook != null) {
            borrowedBook.returnBook();
            System.out.println(name + " returned" + borrowedBook.getTitle());
            borrowedBook = null;
        }else{
            System.out.println("You have no book to return");
        }
    }

}
