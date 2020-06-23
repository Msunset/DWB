package com.dwb.utils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author manke
 * @date 2020-03-18 11:28
 */
public class PageUtils {
    public static PageInfo generatePage(Supplier<List> supplier, int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List list = supplier.get();
        return new PageInfo(list);
    }

}
