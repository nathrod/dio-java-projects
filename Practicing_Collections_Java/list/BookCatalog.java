package list;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> books;

    public BookCatalog(){
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, int publicationYear){
        int exist = 1;
        for(Book book : books) {
            if ((book.getAuthor().equalsIgnoreCase(author)) && (book.getPublicationYear()==publicationYear)) {
                throw new DuplicateItemException("Book already added!");
            }
        }
        Book book = new Book(title, author, publicationYear);
        this.books.add(book);
    }

    public void searchByAuthor(String author){
        List<Book> authorBooks = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)) {
                authorBooks.add(book);
            }
        }

        if(authorBooks.isEmpty()){
            System.out.println("No books found for " + author);
        }else{
            System.out.println("Books written by : ");
            int count = 1;
            for(Book book : authorBooks){
                System.out.println(count + " - " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublicationYear());
                count++;
            }
        }
    }

    public void searchByYearRange(int initialYear, int finalYear){
        List<Book> yearRange = new ArrayList<>();
        for(Book book : books){
            if(book.getPublicationYear()>=initialYear && book.getPublicationYear()<=finalYear ){
                yearRange.add(book);
            }
        }

        if(yearRange.isEmpty()){
            System.out.println("No books publication found from " + initialYear + " to " + finalYear);
        }else{
            int count = 1;
            for(Book book : yearRange){
                System.out.println(count + " - " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublicationYear());
                count++;
            }
        }
    }

    public void searchByTitle(String title){
        List<Book> bookByTitle = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                bookByTitle.add(book);
            }
        }

        if(bookByTitle.isEmpty()){
            System.out.println("No books found!");
        }else{
            int count = 1;
            for(Book book : bookByTitle){
                System.out.println(count + " - " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublicationYear());
                count++;
            }
        }
    }
}
