package HW;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5, 3);
        Book book1 = new Book("1984", "George Orwell", "12345678");
        Book book2 = new Book("Harry Potter and Sorcerer's Stone", "Rowling", "375723345");

        library.addBook(book1);
        library.addBook(book2);

        LibraryMember member1 = new LibraryMember("SeongBeom", "A123");
        LibraryMember member2 = new LibraryMember("Minseok", "B1234");

        library.addMember(member1);
        library.addMember(member2);

        library.displayBooks();
        library.displayMembers();

        member1.borrowBook(book1);
        member2.borrowBook(book1);

        member1.returnBook();

        library.displayBooks();


    }
}
