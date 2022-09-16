package com.qilun;

import com.qilun.entity.Author;
import com.qilun.entity.Book;
import com.qilun.entity.Category;
import com.qilun.entity.Publisher;
import com.qilun.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }


    @Bean
    public CommandLineRunner initialCreate(BookService bookService){
        return(args)  -> {
            Book book1 = new Book("ABC", "Book name", "My first book");
            Author author1 = new Author("Test name1", "Test description");
            Category category1 = new Category("Business books");
            Publisher publisher1 = new Publisher("First Publisher");
            book1.addAuthor(author1);
            book1.addCategory(category1);
            book1.addPublisher(publisher1);
            bookService.createBook(book1);

            Book book2 = new Book("ABC1", "Book name", "My first book");
            Author author2 = new Author("Test name2", "Test description");
            Category category2 = new Category("Science books");
            Publisher publisher2 = new Publisher("Second Publisher");
            book2.addAuthor(author2);
            book2.addCategory(category2);
            book2.addPublisher(publisher2);
            bookService.createBook(book2);

            Book book3 = new Book("ABC21", "Book name", "My first book");
            Author author3 = new Author("Test name3", "Test description");
            Category category3 = new Category("Fiction books");
            Publisher publisher3 = new Publisher("Third Publisher");
            book3.addAuthor(author3);
            book3.addCategory(category3);
            book3.addPublisher(publisher3);
            bookService.createBook(book3);
        };
    }

}
