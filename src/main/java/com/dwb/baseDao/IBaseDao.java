package com.dwb.baseDao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author manke
 * @date 2020-03-17 17:04
 */
public interface IBaseDao<T> extends Mapper<T>, MySqlMapper<T> {
}
