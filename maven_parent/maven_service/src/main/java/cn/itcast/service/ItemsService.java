package cn.itcast.service;

import cn.itcast.domain.Items;

/**
 * @author tianchen
 * @date 2019-06-11 13:59
 */
public interface ItemsService {
    /**
     * 根据id查询项目
     *
     * @param id
     * @return
     */
    Items findById(Integer id);
}
