package com.xfactor.openlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.xfactor.openlibrary.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByIsbn(String isbn);
}