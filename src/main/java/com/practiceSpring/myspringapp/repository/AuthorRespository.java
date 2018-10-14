package com.practiceSpring.myspringapp.repository;

import com.practiceSpring.myspringapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRespository extends CrudRepository<Author,Long> {
}
