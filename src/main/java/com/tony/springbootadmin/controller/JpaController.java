package com.tony.springbootadmin.controller;

import com.tony.springbootadmin.entity.Hbook;
import com.tony.springbootadmin.repository.HBookRepository;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
/**
 * @author 黄大娘
 * @company dogsun公司
 * @create 2019-11-13 20:24
 */
@Log4j2
@RestController
@RequestMapping("/jpa")
public class JpaController {
    private final HBookRepository hBookRepository;

    public JpaController(HBookRepository hBookRepository) {
        this.hBookRepository = hBookRepository;
    }

    @RequestMapping("/add")
    public String add(Hbook hbook){
        hBookRepository.save(hbook);
        return "success";
    }

    @RequestMapping("/edit")
    public String edit(Hbook hbook){
        hBookRepository.save(hbook);
        return "success";
    }

    @RequestMapping("/del")
    public String del(Hbook hbook){
        hBookRepository.delete(hbook);
        return "success";
    }

    @RequestMapping("/getOne")
    public Hbook getOne(Integer bid){
//        会出现懒加载问题：org.hibernate.LazyInitializationException: could not initialize proxy - no Session
//        return hHBookDao.getOne(bid);
        return hBookRepository.findById(bid).orElse(new Hbook());
    }

    @RequestMapping("/getAll")
    public List<Hbook> getAll(){
        log.warn("xxxxxx");
        return hBookRepository.findAll();
    }

    @GetMapping("/getByName")
    public  List<Hbook> getByName(String name){
       return hBookRepository.findByBname(name);
    }
    @GetMapping("/getByNameLike")
    public  List<Hbook> getByNameLike(String name, Pageable pageable){
       return hBookRepository.findByBnameLike(name,pageable);
    }
}