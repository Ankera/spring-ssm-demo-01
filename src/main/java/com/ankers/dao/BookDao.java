package com.ankers.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ankers.po.Book;
import java.util.List;

public interface BookDao {

    @Insert("insert into book(type, name, description) values (" +
            "#{type}," +
            "#{name}," +
            "#{description}" +
            ")")
    Integer save(Book book);

    @Select("select * from book where id = #{id};")
    Book getById(Integer id);

    @Select("select * from book;")
    List<Book> getAll();
}

