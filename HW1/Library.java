package HW1;

public class Library {
    private Book[] books;
    private LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    public Library(int maxBooks, int maxMembers) {
        books = new Book[maxBooks];
        members = new LibraryMember[maxMembers];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount <books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Added new book: " + book.getTitle());
        } else {
            System.out.println("Library is full, you cannot add more books");
        }
    }

    public void addMember(LibraryMember member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
            System.out.println("Added new member: " + member.getName());
        } else {
            System.out.println("Library has reached the maximum number number of members");
        }
    }

    public Book findBookByIsbn(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public LibraryMember findMemberById(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId().equals(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("List of books in the library: ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getTitle());
        }
    }

    public void displayMembers() {
        System.out.println("List of Members of the library: ");
        for (int i = 0; i < memberCount; i++) {
            System.out.println(members[i].getName());
        }
    }

 }
