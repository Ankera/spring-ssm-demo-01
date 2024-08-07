package com.ankers.controller;

import com.ankers.po.Book;
import com.ankers.service.BookService;
import com.ankers.vo.Code;
import com.ankers.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    Result save(@RequestBody Book book) {
        Boolean result = bookService.save(book);
        Integer code  = result ? Code.SAVE_OK : Code.SAVE_ERR;
        String msg = result ? "Book saved" : "Book not saved";
        return new Result(code, msg, result);
    }

    @GetMapping
    Result getAll() {
        List<Book> books = bookService.getAll();
        Integer code = books != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = books != null ? "Books selected" : "Books not selected";
        return new Result(code, msg, books);
    }

    @GetMapping("/{id}")
    Result getById(@PathVariable("id") Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String msg = book != null ? "Book selected" : "Book not selected";
        return new Result(code, msg, book);
    }
}
