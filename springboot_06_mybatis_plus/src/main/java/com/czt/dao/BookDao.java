package com.czt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czt.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {
}
