package com.dwb.common;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author manke
 * @date 2020-03-20 13:48
 */
public class PageResController {
    public static Map<String ,Object> pageRes(PageInfo pageInfo){
        //返回分页封装数据


            HashMap<String, Object> resData = new HashMap<>();
            resData.put("records", pageInfo.getList());
            resData.put("totalRecodes", pageInfo.getTotal());
            resData.put("pageNo",pageInfo.getPageNum());
            resData.put("pageSize",pageInfo.getPageSize());
            resData.put("totalPages",pageInfo.getPages());
            return resData;
    }
}
