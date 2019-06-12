package cn.itcast.service.impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianchen
 * @date 2019-06-11 14:00
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao items_dao;

    @Override
    public Items findById(Integer id) {
        return items_dao.findById(id);
    }
}
