package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author LJ
 * @date 2020/2/23 18:01
 */
public interface ItemsService {
    List<Items> list();

    void save(Items items);
}
