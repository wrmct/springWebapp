package com.ts.springWebapp.repositories;

import com.ts.springWebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
