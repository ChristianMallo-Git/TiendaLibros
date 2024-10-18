package cm.tienda_libros.service;

import cm.tienda_libros.model.Book;

import java.util.List;

public interface IBookService {
    public List<Book> listBooks();

    public Book searchBookById(Integer idBook);

    public void saveBook(Book book);

    public void deleteBook(Book book);
}
