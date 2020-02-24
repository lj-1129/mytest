package com.itheima;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author LJ
 * @date 2020/2/23 22:53
 */
public class ServiceTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService) context.getBean("itemsServiceImpl");
        List<Items> list = itemsService.list();
        System.out.println(list.size());
    }
}
