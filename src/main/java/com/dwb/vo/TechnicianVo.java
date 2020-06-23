package com.dwb.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author manke
 * @date 2020-06-23 16:10:00
 * @email 
 */
@Data
@ApiModel("技师")
public class TechnicianVo implements Serializable  {

    @ApiModelProperty(value = "自增id")
    @Id
    private Integer id;
    @ApiModelProperty(value = "状态（0正常,1禁止发言,2禁止登录）")
    private Boolean status;

    @ApiModelProperty(value = "配合密码加密串")
    private String salt;

    @ApiModelProperty(value = "登录密码")
    private String pwd;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号码")
    private String mobile;


    @ApiModelProperty(value = "性别（0保密，1女，2男）")
    private Boolean gender;


    @ApiModelProperty(value = "所在省")
    private String province;

    @ApiModelProperty(value = "所在市")
    private String city;

    @ApiModelProperty(value = "生日")
    private Integer birthday;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "是否已删除（0否,大于0删除时间）")
    private Integer isDeleteTime;

    @ApiModelProperty(value = "添加时间")
    private Integer addTime;

    @ApiModelProperty(value = "更新时间")
    private Integer updTime;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "技能介绍")
    private String jinengDesc;

    @ApiModelProperty(value = "身份证号")
    private String idcard;

    @ApiModelProperty(value = "资质图片")
    private String image;

    @ApiModelProperty(value = "技师id")
    private Integer jishiId;

}