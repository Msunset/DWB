package com.dwb.service;

import com.dwb.entity.PEnterprise;
import com.dwb.mappers.EnterpriseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author manke
 * @Date 2020/6/23 10:43
 * @Version 0.0.1
 */
@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseMapper enterpriseMapper;
    public PEnterprise getInfo() {
        return enterpriseMapper.selectAll().get(0);

    }
}
