package Iterator;

public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Aaaa"));
        bookShelf.appendBook(new Book("bbbbbb"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("DDDDD"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
