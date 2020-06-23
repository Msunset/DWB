package com.dwb.service;

import com.dwb.entity.SJishi;
import com.dwb.mappers.TechnicianMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.dwb.common.check.Check.CHECK_TECHNICIAN;

/**
 * @Author manke
 * @Date 2020/6/23 16:18
 * @Version 0.0.1
 */
@Service
public class TechnicianService {

    @Autowired
    private TechnicianMapper technicianMapper;

    public void insert(SJishi technician) {
        CHECK_TECHNICIAN(technician); //校验
//        technicianMapper.insert(technician);


    }

}
