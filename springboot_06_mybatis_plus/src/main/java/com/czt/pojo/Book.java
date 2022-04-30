package com.czt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class Book {
    @TableId(type = IdType.AUTO)
    private int id;
    private String username;
    private String password;
    private String birthday;

}
