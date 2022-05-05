package com.czt;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.czt.dao.BookDao;
import com.czt.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07SsmpApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.selectById(2);
    }

    @Test
    public void testPage(){
        IPage page = new Page(1,3);
        bookDao.selectPage(page,null);
    }

    @Test
    void testGetBy(){
        String name = "t";

        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name != null,Book::getUsername,name);      //表明username非空时，执行语句.
        bookDao.selectList(lqw);
    }
}
