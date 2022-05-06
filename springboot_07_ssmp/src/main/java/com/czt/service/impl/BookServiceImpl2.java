package com.czt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czt.dao.BookDao;
import com.czt.pojo.Book;
import com.czt.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {

}
