package cm.tienda_libros.repository;

import cm.tienda_libros.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Integer>{
}
