package cm.tienda_libros.service;

import cm.tienda_libros.model.Book;
import cm.tienda_libros.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService implements IBookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> listBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book searchBookById(Integer idBook) {
        Book book = bookRepository.findById(idBook).orElse(null);
        return book;
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);

    }
}
