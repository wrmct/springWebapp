package com.ts.springWebapp.repositories;

import com.ts.springWebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
