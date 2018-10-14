package com.practiceSpring.myspringapp.repository;

import com.practiceSpring.myspringapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
