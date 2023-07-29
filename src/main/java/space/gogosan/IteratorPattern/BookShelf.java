package space.gogosan.IteratorPattern;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    public ArrayList<Book> books;
    public BookShelf(){
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }

    public class BookShelfIterator implements Iterator{
        private BookShelf bookShelf;
        private int index;

        public BookShelfIterator(BookShelf bookShelf){
            this.bookShelf = bookShelf;
            this.index = 0;
        }

        public boolean hasNext(){
            return index < bookShelf.getLength();
        }

        public Object next(){
            Book book = bookShelf.getBookAt(index);
            index++;
            return book;
        }
    }


}
