package cn.itcast.dao;

import cn.itcast.domain.Items;

/**
 * @author tianchen
 * @date 2019-06-11 11:21
 */
public interface ItemsDao {
    /**
     * 根据id查询项目
     *
     * @param id
     * @return
     */
    Items findById(Integer id);
}
