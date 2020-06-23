package com.dwb.entity;

import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author manke
 * @Date 2020/6/23 10:30
 * @Version 0.0.1
 */
@Data
public class PEnterprise implements Serializable {

    @Id
    private Integer id;
    private String enterpriseName;
    private String describeV;


}
