package com.czt.dao;

import com.czt.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao {
    @Select("select * from tb1_book where id = #{id}")
    Book getById(int id);
}
