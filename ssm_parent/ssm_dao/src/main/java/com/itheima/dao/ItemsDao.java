package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author LJ
 * @date 2020/2/23 17:35
 */
public interface ItemsDao {
    public List<Items> list();

    public int save(Items items);
 }
