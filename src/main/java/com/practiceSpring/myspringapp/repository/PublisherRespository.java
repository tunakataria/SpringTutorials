package com.practiceSpring.myspringapp.repository;

import com.practiceSpring.myspringapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRespository extends CrudRepository<Publisher, Long> {

}
