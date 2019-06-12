package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tianchen
 * @date 2019-06-11 15:06
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService items_service;

    @RequestMapping("/findById")
    public String findById(Model model) {
        Items items = items_service.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
