package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> list();

//    哈师大

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name, create_time, update_time) values (#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);

    @Update("UPDATE dept SET name = #{name} WHERE id = #{id}")
    void updateById(Integer id, String name);
}
