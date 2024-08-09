package HW;

public class bookClassMember {
    String name;
    String memberld;
    boolean borrowedBook;
}

    public bookClassMember (String name, String memberled){
        this.name = name;
        this.memberled = memberled;
        this.borrowedBook = false;
}

    public void borrowBook(){
    if(!borrowedBook) {
        borrowedBook = true;
        System.out.println("You can not borrow a book");
            }else{
        System.out.println("You can borrow a book");
    }
}

    public void returnbook(){
    if(!borrowedBook) {
        borrowedBook = true;
        System.out.println("You have returned a book");
            }else{
        System.out.println("You have no book to return");
    }
}

    public String getName(){
        return name;
}

    public String getMemberld(){
    return memberld;
}

    public boolean borrowedBook() {
        return borrowedBook;
}