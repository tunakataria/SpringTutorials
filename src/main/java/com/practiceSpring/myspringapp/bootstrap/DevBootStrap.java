package com.practiceSpring.myspringapp.bootstrap;

import com.practiceSpring.myspringapp.model.Author;
import com.practiceSpring.myspringapp.model.Book;
import com.practiceSpring.myspringapp.model.Publisher;
import com.practiceSpring.myspringapp.repository.AuthorRespository;
import com.practiceSpring.myspringapp.repository.BookRepository;
import com.practiceSpring.myspringapp.repository.PublisherRespository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRespository authorRespository;
    private BookRepository bookRepository;
    private PublisherRespository publisherRespository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }

    public DevBootStrap(AuthorRespository authorRespository, BookRepository bookRepository, PublisherRespository publisherRespository) {
        this.authorRespository = authorRespository;
        this.bookRepository = bookRepository;
        this.publisherRespository = publisherRespository;
    }

    private void init() {

        Author eric = new Author("Eric", "John");

        Publisher publiser1 = new Publisher("Falcon Press", "Germany");

        Book j2ee = new Book("The J2ee Book");

        eric.getBooks().add(j2ee);
        j2ee.getAuthors().add(eric);
        j2ee.setPublisher(publiser1);
        publiser1.setBook(j2ee);


        authorRespository.save(eric);
        bookRepository.save(j2ee);
        publisherRespository.save(publiser1);

        Publisher publisher2 = new Publisher("Xoriant Press", "Lodz");
        Book spring = new Book("The Spring Book");
        Author deric = new Author("Deric", "Banas");

        publisher2.setBook(spring);
        spring.setPublisher(publisher2);
        deric.getBooks().add(spring);
        spring.getAuthors().add(deric);

        authorRespository.save(deric);
        bookRepository.save(spring);
        publisherRespository.save(publisher2);

    }
}
