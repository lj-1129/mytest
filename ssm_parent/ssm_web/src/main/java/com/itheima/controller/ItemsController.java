package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author LJ
 * @date 2020/2/23 18:33
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    public ModelAndView list(ModelAndView modelAndView){
        List<Items> list = itemsService.list();
        modelAndView.setViewName("items");
        modelAndView.addObject("list",list);
        System.out.println("我是热部署。。。");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Items items){
        itemsService.save(items);
        return "redirect:/items/list";//保存成功后 重定向items.jsp
    }
}
