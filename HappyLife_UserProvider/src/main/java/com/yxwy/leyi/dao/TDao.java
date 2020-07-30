package com.yxwy.leyi.dao;

import com.yxwy.leyi.entity.T;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TDao {
    @Select("select * from test")
    public T findAll();
}
