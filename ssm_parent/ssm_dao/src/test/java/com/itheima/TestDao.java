package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author LJ
 * @date 2020/2/23 17:43
 */
public class TestDao {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) context.getBean("itemsDao");
        List<Items> list = itemsDao.list();
        System.out.println(list);

        Items items = new Items();
        items.setName("苹果手机");
        items.setPrice(12000f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
