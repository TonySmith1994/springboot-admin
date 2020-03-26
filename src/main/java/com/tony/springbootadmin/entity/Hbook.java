package com.tony.springbootadmin.entity;
import lombok.Data;
import lombok.ToString;


import javax.persistence.*;
/**
 * @author 黄大娘
 * @company dogsun公司
 * @create 2019-11-13 19:18
 */
@Data
@Entity   //注释它为实体类
@Table(name = "t_springboot_hbook") //设置要生成的表名
public class Hbook {

    @Id
    @GeneratedValue
    private Integer bid;
    /**
     * 创建这个列值得长度
     */
    @Column(length = 100)
    private String bname;

    @Column
    private Float price;
}