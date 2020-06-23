package com.dwb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 189****3725
 * @date 2020-06-23 17:30:45
 * @email 
 */
@Data
@ApiModel("技师资质")
public class SJishiZizhi {

    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "资质图片")
    private String image;

    @ApiModelProperty(value = "技师id")
    private Integer jishiId;

}