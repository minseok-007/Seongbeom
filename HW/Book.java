package HW;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book (String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public void borrowBook(){
        if(!isBorrowed) {
            isBorrowed = true;
        System.out.println("The book" + title + "has been borrowed");
    } else{
        System.out.println("The book" + title + "is already borrowed");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The book" + title + "has been returned");
        } else {
            System.out.println("The book" + title + "was not borrowed");
        }
    }

    public String getTitle(){
        return title;
    }

    public String getAuther(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }

    public String toSting() {
        return "Book [Title: " + title + ", Auther:" + author + ", ISBN: " + isbn + "]";
    }


}
