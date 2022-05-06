package com.czt.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.czt.pojo.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book selectById(Integer id);
    List<Book> selectAll();
    IPage<Book> getPage(int currentPage, int pageSize);
}
