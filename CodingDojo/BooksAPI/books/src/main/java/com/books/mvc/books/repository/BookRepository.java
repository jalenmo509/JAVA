package com.books.mvc.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.mvc.books.models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
