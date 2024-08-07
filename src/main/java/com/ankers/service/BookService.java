package com.ankers.service;

import com.ankers.po.Book;
import java.util.List;

public interface BookService {

    boolean save(Book book);

    Book getById(Integer id);

    List<Book> getAll();
}

