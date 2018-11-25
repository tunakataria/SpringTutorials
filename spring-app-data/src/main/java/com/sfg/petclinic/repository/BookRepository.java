package com.sfg.petclinic.repository;


import com.sfg.petclinic.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
