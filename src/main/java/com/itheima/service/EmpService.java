package com.itheima.service;

import com.itheima.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工管理
 */
public interface EmpService {
    /**
     * 分页查询
     * @param start
     * @param pageSize
     * @return
     */
    public PageBean page(Integer start, Integer pageSize,
                         String name, Short gender,
                         LocalDate begin,
                         LocalDate end);

    /**
     * 批量删除
     * @param ids
     */
    void delete(List<Integer> ids);
}