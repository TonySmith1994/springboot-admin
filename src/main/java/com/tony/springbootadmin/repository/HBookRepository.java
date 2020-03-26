package com.tony.springbootadmin.repository;

import com.tony.springbootadmin.entity.Hbook;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 黄大娘
 * @company dogsun公司
 * @create 2019-11-13 20:18
 * 只要继承JpaRepository，通常所用的增删查改方法都有
 * 第一个参数：操作的实体类
 * 第二个参数：实体类对应数据表的主键
 */
public interface HBookRepository extends JpaRepository<Hbook,Integer> {

    List<Hbook> findByBname(String name);

    List<Hbook>  findByBnameLike(String name, Pageable pageable);
}