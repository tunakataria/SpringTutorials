package com.sfg.petclinic.repository;

import com.sfg.petclinic.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRespository extends CrudRepository<Author,Long> {
}
