package com.czt.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.czt.controller.utils.R;
import com.czt.pojo.Book;
import com.czt.service.IBookService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController         //加载成bean
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping             //查询使用get请求
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        if(book.getUsername().equals("123")) throw  new IOException();
        boolean flag = bookService.save(book);
        return new R(flag,flag ? "添加成功" : "添加失败");
    }

    @PutMapping
    public R update(@RequestBody QueryWrapper<Book> qw){
        return new R(bookService.update(qw));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){        //@PathVariable表示从路径中获取数据
        return new R(bookService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,bookService.getPage(currentPage,pageSize));
    }
}
