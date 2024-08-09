package HW;

import java.awt.print.Book;

public class libraryClass {
    int bookCount;
    int memberCount;
    String LibraryMember[] members;
    String Book[] books;
    String isbn;
    String memberId;
    String title;
    String memberName;
}

    public Library(int maxBooks, int maxMembers){
        int books = new Book[maxBooks];
        int members = new LibraryMember[maxMembers];
        int bookCount = 0;
        int memberCount = 0;
    }

    public void addingBook(Book book){
        if (bookCount < books.length){
            book[bookCount++] = book;
            System.out.println(title + "Book added");
        } else {
            System.out.println("You can not add more books, the library is full");
        }
}

    public void addMember(LibraryMember member){
    if (memberCount < members.length) {
            members[memberCount++] = member;
            System.out.println(memberName + "added");
        } else {
        System.out.println("You can not add more members, the library is full");
        }
}

    public Book (String isbn){
        for (int i = 0; i < bookCount; i++) {
            if (books[i] == isbn) {
                retun books[ i];
            }
        }
        return null;
}

    public LibraryMember (String memberID){
        for (int i = 0; i < memberCount; i++){
            if (members[i] == memberID){
                return members[i];
            }
        }
        return null;
}

    public void displayBooks(){
    System.our.println("The books in the library:");
        for int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
}

    public void displayMembers() {
    System.out.println("Library members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.println(members[i]);
        }
}

