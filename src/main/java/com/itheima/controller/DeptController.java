package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping
    public Result list(){

        List<Dept> deptList = deptService.list();

        log.info("查询所有部门数据");
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门:{}", id);
        // 调用Service删除部门
        deptService.delete(id);
        return Result.success();
    }

    // @RequestBody 作用于Json数据
    @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}", dept);
        // 调用service中的方法增加数据
        deptService.add(dept);

        return Result.success();
    }

    // 更新数据
    @PutMapping
    public Result update(@RequestBody Integer id, @RequestBody String name){
        deptService.update(id, name);

        log.info("部门修改为：{}", name);

        return Result.success();
    }


}
